package com.example.demo;

import lombok.*;

@Getter
@ToString(exclude = {"age", "email"})
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class PersonLombok {
    private Integer id;
    private String name;
    @Setter(AccessLevel.PRIVATE)
    private int age;
    @Setter
    private String email;


}
