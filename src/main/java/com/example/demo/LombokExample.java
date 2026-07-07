package com.example.demo;

public class LombokExample {

    public static void main(String[] arge) {
        PersonLombok person = new PersonLombok(1, "Aaron", 10, "aaron@example.com");


        System.out.println("---");
        System.out.println(person);              // 객체 저장 주소
        System.out.println(person.toString());   // 객체 저장 주소
    }
}
