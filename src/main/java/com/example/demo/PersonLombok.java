package com.example.demo;

import lombok.*;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true, includeFieldNames = false)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class PersonLombok {
    @ToString.Include(name = "memberId")
    private Integer id;
    @ToString.Include(rank = -1)
    private String name;
    private int age;
    @Setter
    private String email;

    public boolean equals(PersonLombok member) {
        return this.id.equals(member.id) &&
                this.name.equals(member.name) &&
                this.age == member.age &&
                this.email.equals(member.email);
    }
}
