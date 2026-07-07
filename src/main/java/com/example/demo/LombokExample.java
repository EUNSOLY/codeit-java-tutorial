package com.example.demo;


public class LombokExample {

    public static void main(String[] arge) {
        adminPerson person = new adminPerson(1, "Aaron", "DEVELOPER");


        System.out.println("---");
        System.out.println(person);              // 객체 저장 주소
        System.out.println(person.toString());   // 객체 저장 주소


//      person.setId();                          // @Setter 필드 단위로 설정되어있지 않아 필드 수정 불가능
//      person.setName();                        // @Setter 필드 단위로 설정되어있지 않아 필드 수정 불가능
//      aaron.setAge(20);                       // @Setter 필드 단위로 설정되었지만, 접근제어자를 Private 로 바꾸어서 외부에서 호출 불가
        person.setEmail("aaron@different.com");  // @Setter (필드 단위)

        System.out.println(person.getId());      // @Getter 클래스 단위로 적용하여 모든 필드 조회 가능
        System.out.println(person.getName());    // @Getter (클래스 단위)
        System.out.println(person.getAge());     // @Getter (클래스 단위)
        System.out.println(person.getEmail());   // @Getter (클래스 단위)
    }
}
