package com.ramsid.QueueFlow.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;

    @Column(nullable = false, length = 200)
    private String title;

    @Column(nullable = false)
    private Integer duration_minutes;

    @Column(nullable = false, length = 50)
    private String language;

    @Column(nullable = false, length = 50)
    private String genre;

    @OneToMany(mappedBy = "event")
    private List<Show> show  = new ArrayList<>();

}
