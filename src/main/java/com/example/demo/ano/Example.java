package com.example.demo.ano;


public class Example {
    public static void main(String[] arge) {
        Member aaron = new Member("Aaron");

        aaron.setEmail("aaron@example.com");
        Member baron = new Member("Baron");

        Member baron = new Member();
        baron.setName("Baron");
        baron.setEmail("baron@example.com");

        System.out.println("---");
        System.out.println(baron.toString());   // 객체
        System.out.println(baron.getName());    // 필드 중 name
    }
}
