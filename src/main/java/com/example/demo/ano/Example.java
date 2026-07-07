package com.example.demo.ano;


public class Example {
    public static void main(String[] arge) {
        MemberRequestDto dto = new MemberRequestDto("Aaron", "aaron@example.com");
        Member aaron = new Member(dto);

        System.out.println("---");
        System.out.println(aaron);   // 객체
        System.out.println(aaron.toString());   // 객체
        System.out.println(aaron.getName());    // 필드 중 name
        //      System.out.aaron(baron.name)
    }
}
