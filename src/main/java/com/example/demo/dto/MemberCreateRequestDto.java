package com.example.demo.dto;


import lombok.*;

@Getter
@AllArgsConstructor
public class MemberCreateRequestDto {
    private String name;
    private String email;
}
