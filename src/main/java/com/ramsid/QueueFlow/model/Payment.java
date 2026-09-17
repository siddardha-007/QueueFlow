package com.ramsid.QueueFlow.model;

import com.ramsid.QueueFlow.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long paymentId;

     @Column(nullable = false, length = 100, unique = true)
     private String transactionId;

     @Column(precision = 10, scale = 2, nullable = false)
     private BigDecimal amount;

     @Enumerated(EnumType.STRING)
     @Column(nullable = false)
     private PaymentStatus status;

     @Column(nullable = false, length = 30)
     private String paymentMethod;

     @ManyToOne
     @JoinColumn(name = "booking_id", nullable = false)
     private Booking booking;



}
