package com.ramsid.QueueFlow.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TheaterRequestDto {

    private Long theaterId;

    private String name;

    private String address;

    private Long cityId;

}
