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
    @EqualsAndHashCode.Exclude
    private int age;
    @Setter
    @EqualsAndHashCode.Exclude
    private String email;
}
