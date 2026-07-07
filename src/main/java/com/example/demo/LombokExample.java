package com.example.demo;

public class LombokExample {

    public static void main(String[] arge) {
        PersonLombok person = new PersonLombok(1, "Aaron", 10, "aaron@example.com");


        System.out.println("---");
        System.out.println(person);              // 객체 저장 주소
        System.out.println(person.toString());   // 객체 저장 주소


//      person.setId();                          // @Setter 필드 단위로 설정되어있지 않아 필드 수정 불가능
//      person.setName();                        // @Setter 필드 단위로 설정되어있지 않아 필드 수정 불가능
        person.setAge(20);                       // @Setter (필드 단위)
        person.setEmail("aaron@different.com");  // @Setter (필드 단위)

        System.out.println(person.getId());      // @Getter 클래스 단위로 적용하여 모든 필드 조회 가능
        System.out.println(person.getName());    // @Getter (클래스 단위)
        System.out.println(person.getAge());     // @Getter (클래스 단위)
        System.out.println(person.getEmail());   // @Getter (클래스 단위)
    }
}
