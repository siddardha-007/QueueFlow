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
public class Screen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long screenId;

    @Column(nullable = false, length = 100)
    private String screenName;

    @Column(nullable = false)
    private int totalSeats;

    @ManyToOne
    @JoinColumn(name = "theater_id", nullable = false)
    private Theater theater;

    @OneToMany(
            mappedBy = "screen",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Seat> seats  = new ArrayList<>();

    @OneToMany(mappedBy = "screen")
    private List<Show> show = new ArrayList<>();
}
