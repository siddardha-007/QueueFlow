package com.ramsid.QueueFlow.dto.request;

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
public class ShowSeatRequestDto {
    private BigDecimal price;

    private Long seatId;

    private Long showId;
}
