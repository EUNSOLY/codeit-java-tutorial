package com.example.demo;

import lombok.*;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true, includeFieldNames = false)
@EqualsAndHashCode
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class PersonLombok {
    @ToString.Include(name = "memberId")
    private Integer id;
    @ToString.Include(rank = -1)
    private String name;
    private int age;
    @Setter
    private String email;
}
