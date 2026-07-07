package com.example.demo;

import lombok.*;

import java.time.LocalDate;


@ToString(callSuper = true)
@EqualsAndHashCode
public class adminPerson extends PersonLombok {
    private String role;
    private LocalDate allocatedAt;

    public adminPerson(Integer id, String name, int age, String email, String role) {
        super(id, name, age, email);
        this.role = role;
        this.allocatedAt = LocalDate.now();
    }

    //    public String toString() {
//        return String.format(
//                "adminPerson(id=%s, name=%s, age=%s, email=%s, role=%s, allocated=%s)",
//                this.getId(), this.getName(), this.getAge(), this.getEmail(), this.role, this.allocatedAt
//        );
//    }
}
