package com.example.demo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
public class PersonLombok {
    private Integer id;
    private String name;
    private int age;
    private String email;


}
