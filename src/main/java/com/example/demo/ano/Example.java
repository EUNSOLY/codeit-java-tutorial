package com.example.demo.ano;


import com.example.demo.dto.MemberCreateRequestDto;

import java.util.List;

public class Example {
    public static void main(String[] arge) {


        Member aaron = new Member(1, "Aaron", 10, "aaron@example.com");
        MemberCreateRequestDto requestDto = new MemberCreateRequestDto("Baron", "baron@example.com");
        Member baron = Member.from(requestDto);
        
        System.out.println("---");
        System.out.println(aaron);              // 객체
        System.out.println(aaron.toString());   // 객체
        System.out.println(aaron.getName());    // 필드 중 name
//      System.out.println(aaron.name);         // 필드 중 name (접근제어자 private)


        System.out.println("---");
        System.out.println(baron);              // 객체
        System.out.println(baron.toString());   // 객체
        System.out.println(baron.getName());    // 필드 중 name
//      System.out.println(baron.name);         // 필드 중 name (접근제어자 private)
    }
}
