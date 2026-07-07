package com.example.demo.ano;


public class Example {
    public static void main(String[] arge) {

        Member aaron = Member.builder()
                .name("Aaron")
                .email("aaron@example.com")
                .build();
//        Member baron = new Member("Baron", "baron@example.com");

        System.out.println("---");
        System.out.println(aaron);              // 객체
        System.out.println(aaron.toString());   // 객체
        System.out.println(aaron.getName());    // 필드 중 name
//      System.out.println(aaron.name);         // 필드 중 name (접근제어자 private)

//        System.out.println("---");
//        System.out.println(baron);              // 객체
//        System.out.println(baron.toString());   // 객체
//        System.out.println(baron.getName());    // 필드 중 name
//      System.out.println(baron.name);         // 필드 중 name (접근제어자 private)
    }
}
