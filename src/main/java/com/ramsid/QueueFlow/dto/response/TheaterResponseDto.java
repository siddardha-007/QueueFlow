package com.ramsid.QueueFlow.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TheaterResponseDto {

    private Long theaterId;

    private String name;

    private String address;

    private Long cityId;
}
