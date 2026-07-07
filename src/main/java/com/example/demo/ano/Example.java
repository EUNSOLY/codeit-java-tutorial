package com.example.demo.ano;


import com.example.demo.dto.MemberCreateRequestDto;

import java.util.List;

public class Example {
    public static void main(String[] arge) {
        Administrator aaron = new Administrator(1, "Aaron", 12, "aaron@example.com", "DEVELOPER");
        Administrator baron = new Administrator(2, "Baron", 36, "baron@example.com", "DEVELOPER");

        System.out.println("---");
        System.out.println(aaron);              // 객체
        System.out.println(aaron.toString());   // 객체

        System.out.println("---");
        System.out.println(baron);              // 객체
        System.out.println(baron.toString());   // 객체

        System.out.println("---");
        System.out.println(aaron == baron);
        System.out.println(aaron.equals(baron));
    }
}
