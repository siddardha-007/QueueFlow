package com.ramsid.QueueFlow.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ScreenResponseDto {
    private Long screenId;

    private String screenName;

    private Integer totalSeats;

    private Long theaterId;
}
