package com.example.demo;

import lombok.*;

@Getter
@ToString(onlyExplicitlyIncluded = true, includeFieldNames = false)
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class PersonLombok {
    @ToString.Include(name = "memberId")
    private final Integer id;
    @ToString.Include(rank = 1)
    private final String name;
    @Setter(AccessLevel.PRIVATE)
    private int age;
    @Setter
    private String email;
}
