package com.example.demo;

import lombok.*;

@Getter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class PersonLombok {
    private Integer id;
    private String name;
    @Setter(AccessLevel.PRIVATE)
    @ToString.Exclude
    private int age;
    @Setter
    @ToString.Exclude
    private String email;


}
