package com.example.demo;


public class LombokExample {

    public static void main(String[] arge) {
        PersonLombok person = new PersonLombok();

        person.setId(1);                         // @Setter 클래스 단위로 적용하여 모든 필드 수정 가능
        person.setName("Aaron");                 // @Setter (클래스 단위)
        person.setAge(10);                       // @Setter (클래스 단위)
        person.setEmail("aaron@example.com");    // @Setter (클래스 단위)

        System.out.println("---");
        System.out.println(person);              // 객체 저장 주소
        System.out.println(person.toString());   // 객체 저장 주소

        System.out.println(person.getId());      // @Getter 클래스 단위로 적용하여 모든 필드 조회 가능
        System.out.println(person.getName());    // @Getter (클래스 단위)
        System.out.println(person.getAge());     // @Getter (클래스 단위)
        System.out.println(person.getEmail());   // @Getter (클래스 단위)
    }
}
