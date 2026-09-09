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
@Table(
        name = "seats",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uk_screen_row_seat",
                        columnNames = {"screen_id", "rowNumber", "seatNumber"}
                )
        }
)
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seatId;


    @Column(nullable = false, length = 10)
    private String rowNumber;

    @Column(nullable = false)
    private int seatNumber;

    @Column(nullable = false, length = 30)
    private String seatType;

    @ManyToOne
    @JoinColumn(name = "screen_id", nullable = false)
    private Screen screen;
     @OneToMany(mappedBy = "seat")
    private List<ShowSeat> showSeats = new ArrayList<>();

}
