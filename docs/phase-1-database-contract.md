# Phase 1 — Database Contract

## 1. Purpose

Define the initial database entities, fields, relationships, and conventions for the ticket booking system.

This contract will be followed by both developers while implementing Phase 1.

---

## 2. Entities

### User

| Field      | Type         | Constraint       |
| ---------- | ------------ | ---------------- |
| user_id    | BIGINT       | PK               |
| name       | VARCHAR(100) | NOT NULL         |
| email      | VARCHAR(150) | UNIQUE, NOT NULL |
| phone      | VARCHAR(20)  | UNIQUE           |
| created_at | TIMESTAMP    | NOT NULL         |

---

### City

| Field   | Type         | Constraint |
| ------- | ------------ | ---------- |
| city_id | BIGINT       | PK         |
| name    | VARCHAR(100) | NOT NULL   |
| state   | VARCHAR(100) | NOT NULL   |
| country | VARCHAR(100) | NOT NULL   |

---

### Theater

| Field      | Type         | Constraint |
| ---------- | ------------ | ---------- |
| theater_id | BIGINT       | PK         |
| city_id    | BIGINT       | FK → City  |
| name       | VARCHAR(150) | NOT NULL   |
| address    | VARCHAR(255) | NOT NULL   |

Relationship:

```text
City 1 ─────── N Theater
```

---

### Screen

| Field       | Type         | Constraint   |
| ----------- | ------------ | ------------ |
| screen_id   | BIGINT       | PK           |
| theater_id  | BIGINT       | FK → Theater |
| screen_name | VARCHAR(100) | NOT NULL     |
| total_seats | INTEGER      | NOT NULL     |

Relationship:

```text
Theater 1 ─────── N Screen
```

---

### Seat

| Field       | Type        | Constraint  |
| ----------- | ----------- | ----------- |
| seat_id     | BIGINT      | PK          |
| screen_id   | BIGINT      | FK → Screen |
| row_number  | VARCHAR(10) | NOT NULL    |
| seat_number | INTEGER     | NOT NULL    |
| seat_type   | VARCHAR(30) | NOT NULL    |

Relationship:

```text
Screen 1 ─────── N Seat
```

Constraint:

```text
UNIQUE(screen_id, row_number, seat_number)
```

---

### Event

| Field            | Type         | Constraint |
| ---------------- | ------------ | ---------- |
| event_id         | BIGINT       | PK         |
| title            | VARCHAR(200) | NOT NULL   |
| duration_minutes | INTEGER      | NOT NULL   |
| language         | VARCHAR(50)  | NOT NULL   |
| genre            | VARCHAR(50)  | NOT NULL   |

---

### Show

| Field      | Type      | Constraint  |
| ---------- | --------- | ----------- |
| show_id    | BIGINT    | PK          |
| event_id   | BIGINT    | FK → Event  |
| screen_id  | BIGINT    | FK → Screen |
| start_time | TIMESTAMP | NOT NULL    |
| end_time   | TIMESTAMP | NOT NULL    |

Relationships:

```text
Event 1 ─────── N Show
Screen 1 ────── N Show
```

---

### ShowSeat

This is the mapping between a physical seat and a particular show.

| Field        | Type          | Constraint |
| ------------ | ------------- | ---------- |
| show_seat_id | BIGINT        | PK         |
| show_id      | BIGINT        | FK → Show  |
| seat_id      | BIGINT        | FK → Seat  |
| price        | DECIMAL(10,2) | NOT NULL   |
| status       | VARCHAR(20)   | NOT NULL   |
| version      | BIGINT        | NOT NULL   |

Allowed status values:

```text
AVAILABLE
LOCKED
BOOKED
```

Constraint:

```text
UNIQUE(show_id, seat_id)
```

Relationship:

```text
Show 1 ─────── N ShowSeat
Seat 1 ─────── N ShowSeat
```

---

### Booking

| Field        | Type          | Constraint |
| ------------ | ------------- | ---------- |
| booking_id   | BIGINT        | PK         |
| user_id      | BIGINT        | FK → User  |
| show_id      | BIGINT        | FK → Show  |
| total_amount | DECIMAL(10,2) | NOT NULL   |
| status       | VARCHAR(20)   | NOT NULL   |
| created_at   | TIMESTAMP     | NOT NULL   |

Allowed status values:

```text
PENDING
CONFIRMED
CANCELLED
```

Relationships:

```text
User 1 ─────── N Booking
Show 1 ─────── N Booking
```

---

### Payment

| Field          | Type          | Constraint   |
| -------------- | ------------- | ------------ |
| payment_id     | BIGINT        | PK           |
| booking_id     | BIGINT        | FK → Booking |
| transaction_id | VARCHAR(100)  | UNIQUE       |
| amount         | DECIMAL(10,2) | NOT NULL     |
| status         | VARCHAR(20)   | NOT NULL     |
| payment_method | VARCHAR(30)   | NOT NULL     |

Allowed status values:

```text
PENDING
SUCCESS
FAILED
REFUNDED
```

Relationship:

```text
Booking 1 ─────── N Payment
```

---

# 3. Overall Relationship

```text
City
 │
 └── Theater
      │
      └── Screen
           │
           └── Seat


Event
 │
 └── Show
      │
      └── ShowSeat
           │
           └── Seat


User
 │
 └── Booking
      │
      └── Payment
```

---

# 4. Development Split

### Developer 1

Responsible for:

```text
User
City
Theater
Screen
Seat
```

### Developer 2

Responsible for:

```text
Event
Show
ShowSeat
Booking
Payment
```

---

# 5. Conventions

* Database: PostgreSQL
* Primary keys: `BIGINT`
* Foreign keys use the referenced entity's `<entity>_id`
* Money values use `DECIMAL(10,2)`
* Date/time values use `TIMESTAMP`
* Entity/table names should remain consistent between both branches
* `ShowSeat` must have a unique `(show_id, seat_id)` combination
* `version` in `ShowSeat` is reserved for optimistic locking
* Redis locking and Kafka integration are outside the scope of Phase 1

---

# 6. Phase 1 Scope

Phase 1 includes:

* Entity classes
* JPA relationships
* PostgreSQL configuration
* Database constraints
* Basic repository layer
* Basic persistence/integration tests

Phase 1 does **not** include:

* Redis seat locking
* Payment gateway integration
* Kafka
* Notifications
* JWT authentication
* Frontend
* High-concurrency implementation
