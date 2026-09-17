package com.ramsid.QueueFlow.dto.response;

import com.ramsid.QueueFlow.enums.ShowSeatStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShowSeatResponseDto {
    private Long showSeatId;

    private BigDecimal price;

    private ShowSeatStatus status;

    private Long showId;

    private Long seatId;

    private String rowNumber;

    private Integer seatNumber;

    private String seatType;

}
