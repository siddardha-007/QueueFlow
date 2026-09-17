package com.ramsid.QueueFlow.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventRequestDto {
    private String title;

    private Integer duration_minutes;

    private String language;

    private String genre;
}
