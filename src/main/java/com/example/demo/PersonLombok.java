package com.example.demo;

import lombok.*;

@Getter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@ToString(onlyExplicitlyIncluded = true, includeFieldNames = false)
public class PersonLombok {
    @ToString.Include(name = "memberId")
    private Integer id;
    @ToString.Include(rank = 1)
    private String name;
    @Setter(AccessLevel.PRIVATE)
    private int age;
    @Setter
    private String email;


}
