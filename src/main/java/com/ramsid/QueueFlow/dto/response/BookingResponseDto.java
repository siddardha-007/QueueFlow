package com.ramsid.QueueFlow.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookingResponseDto {
    private Long bookingId;

    private Long userId;

    private Long showId;

    private String eventTitle;

    private String theaterName;

    private String screenName;

    private LocalDateTime showStartTime;

    private List<SeatResponseDto> seats;

    private BigDecimal totalAmount;

    private String status;

    private LocalDateTime createdAt;
}
