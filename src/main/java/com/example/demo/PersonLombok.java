package com.example.demo;

import lombok.*;

@Getter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@ToString(onlyExplicitlyIncluded = true)
public class PersonLombok {
    @ToString.Include
    private Integer id;
    @ToString.Include
    private String name;
    @Setter(AccessLevel.PRIVATE)
    private int age;
    @Setter
    private String email;


}
