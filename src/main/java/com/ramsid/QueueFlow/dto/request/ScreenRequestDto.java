package com.ramsid.QueueFlow.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ScreenRequestDto {
    private Long screenId;

    private String screenName;

    private Integer totalSeats;

    private Long theaterId;
}
