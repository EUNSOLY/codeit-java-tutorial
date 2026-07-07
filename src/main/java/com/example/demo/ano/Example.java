package com.example.demo.ano;


public class Example {
    public static void main(String[] arge) {
        Administrator aaron = new Administrator(1, "Aaron", 12, "aaron@example.com", "DEVELOPER");
        Administrator baron = new Administrator(2, "Baron", 36, "baron@example.com", "DEVELOPER");
        System.out.println(aaron);              // 객체
        System.out.println(aaron.getName());    // 필드 중 name
        System.out.println(aaron.toString());   // 객체
        //      System.out.println(aaron.name);         // 필드 중 name (접근제어자 private)

        System.out.println(baron);              // 객체
        System.out.println("---");
        System.out.println(baron.toString());   // 객체
        System.out.println(baron.getName());    // 필드 중 name
        //      System.out.println(baron.name)
    }
}
