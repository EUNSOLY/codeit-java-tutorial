package com.example.demo;


public class LombokExample {

    public static void main(String[] arge) {
        adminPerson person = new adminPerson(1, "Aaron", 12, "aaron@example.com", "DEVELOPER");
        adminPerson person2 = new adminPerson(2, "Baron", 36, "baron@example.com", "DEVELOPER");


        System.out.println("---");
        System.out.println(person);              // 객체 저장 주소
        System.out.println(person.toString());   // 객체 저장 주소
        System.out.println("---");
        System.out.println(person);              // 객체
        System.out.println(person.toString());   // 객체

        System.out.println("---");
        System.out.println(person == person2);
        System.out.println(person.equals(person2));

    }
}
