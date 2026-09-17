package com.ramsid.QueueFlow.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShowRequestDto {

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private Long eventId;

    private Long screenId;
}
