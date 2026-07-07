package com.example.demo;

import lombok.*;

import java.time.LocalDate;

@ToString(callSuper = true)
public class adminPerson extends PersonLombok {
    private String role;
    private LocalDate allocatedAt;

    public adminPerson(Integer id, String name, String role) {
        super(id, name);
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
