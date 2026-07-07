package com.example.demo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class PersonLombok {
    private Integer id;
    private String name;
    private int age;
    private String email;


}
