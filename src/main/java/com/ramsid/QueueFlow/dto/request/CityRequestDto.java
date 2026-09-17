package com.ramsid.QueueFlow.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CityRequestDto {
    private String name;

    private String state;

    private String country;
}
