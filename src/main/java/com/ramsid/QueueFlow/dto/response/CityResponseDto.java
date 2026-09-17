package com.ramsid.QueueFlow.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CityResponseDto {

    private Long cityId;

    private String name;

    private String state;

    private String country;
}
