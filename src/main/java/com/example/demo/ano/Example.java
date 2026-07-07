package com.example.demo.ano;


public class Example {
    public static void main(String[] arge) {
        String request = "AARON";

        // (1) 빌더 정의
        Member.MemberBuilder builder = Member.builder();
        // (2) 필드 설정 : (2.1) 공통 부분을 먼저 설정하고
        builder.age(1)
                .email("common@example.com");

        // (2) 필드 설정 : (2.2) 다른 부분은 따로 설정한다 (조건부)
        if (request.equals("AARON")) {
            builder.id(1).name("Aaron");
        } else if (request.equals("BARON")) {
            builder.id(2).name("Baron");
        }

        //(3) 객체 생성
        Member aaron = builder.build();

        System.out.println("---");
        System.out.println(aaron);              // 객체
        System.out.println(aaron.toString());   // 객체
        System.out.println(aaron.getName());    // 필드 중 name
//      System.out.println(aaron.name);


    }
}
