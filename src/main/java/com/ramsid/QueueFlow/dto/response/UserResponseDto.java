package com.ramsid.QueueFlow.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {
    private Long userId;

    private String name;

    private String email;

    private String phone;

    private LocalDateTime createdAt;
}
