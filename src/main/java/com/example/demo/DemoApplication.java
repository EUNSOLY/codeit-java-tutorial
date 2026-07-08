package com.example.demo;

import com.example.demo.member.Member;

//@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        Member member = new Member(1, "Aaron", 10, "aaron@example.com");

        System.out.println("----");
        System.out.println(member);
        System.out.println(member.toString());
        System.out.println(member.MEMBER_TO_STRING_FORMAT); // * 앞글자 소문자 : 물론 이렇게 호출할 수 있겠지만, 정상사용은 아님
        System.out.println(Member.MEMBER_TO_STRING_FORMAT); // * 앞글자 대문자 : Static 필드는 이렇게 호출하는것이 정상이다.
    }
}
