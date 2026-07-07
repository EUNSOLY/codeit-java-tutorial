package com.example.demo;

import lombok.*;

@Getter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@ToString(of = {"id", "name"})
public class PersonLombok {
    private Integer id;
    private String name;
    @Setter(AccessLevel.PRIVATE)
    private int age;
    @Setter
    private String email;


}
