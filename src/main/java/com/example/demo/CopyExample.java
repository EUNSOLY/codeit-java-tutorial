package com.example.demo;

import com.example.demo.member.Member;

public class CopyExample {
    public static void main(String[] args) {
        // 기본형 타입 (값이 복사됨)
        int copier = 100;
        int copiee = copier;

        copier = 200;

        System.out.println(copier);
        System.out.println(copiee);

        // 참조형 타입 (값을 갖고있는 주소가 복사됨 Shallow Copy - 얇은 복사)
        Member memberCopier = new Member("Aaron");
        Member memberCopiee = memberCopier;

        System.out.println(memberCopiee); // com.example.demo.member.Member@15db9742
        System.out.println(memberCopier); // com.example.demo.member.Member@15db9742

        memberCopier.setName("Baron") ;

        System.out.println(memberCopier.getName()); // Baron
        System.out.println(memberCopiee.getName()); // Baron


        // 참조형 타입 (값을 복사함 Depp Copy - 깊은 복사)
        Member memberCopier2 = new Member("Aaron");
        Member memberCopiee2 = new Member(memberCopier2.getName());

        System.out.println(memberCopiee2); // com.example.demo.member.Member@6d06d69c
        System.out.println(memberCopier2); // com.example.demo.member.Member@7852e922

        memberCopiee2.setName("Baron");

        System.out.println(memberCopier2.getName()); // Aaron
        System.out.println(memberCopiee2.getName()); // Baron


    }
}