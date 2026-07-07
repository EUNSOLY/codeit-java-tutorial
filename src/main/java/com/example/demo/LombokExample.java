package com.example.demo;


public class LombokExample {

    public static void main(String[] arge) {
        PersonLombok person = new PersonLombok(1, "Aaron", 12, "aaron@example.com");
        PersonLombok person2 = new PersonLombok(1, "Aaron", 24, "aaron@different.com");
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
