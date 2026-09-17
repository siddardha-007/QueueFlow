package com.ramsid.QueueFlow.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SeatResponseDto {

    private Long seatId;

    private String rowNumber;

    private int seatNumber;

    private String seatType;

    private Long screenId;

    private String screenName;
}
