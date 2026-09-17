package com.ramsid.QueueFlow.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SeatRequestDto {
    private String rowNumber;

    private int seatNumber;

    private String seatType;

    private Long screenId;
}
