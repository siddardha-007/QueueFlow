package com.ramsid.QueueFlow.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShowResponseDto {

    private Long showId;

    private LocalDate startTime;

    private LocalDateTime endTime;

    private Long eventId;

    private Long screenId;

}
