package com.example.demo;


import com.example.demo.member.Member;

//@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        int[] int_array = new int[3];                        // 길이 기반 Array 초기화 (기본형 타입)
        int[] int_array2 = {1, 2, 3};                        // 값 기반 Array 초기화 (기본형 타입)
        Integer[] integer_array = new Integer[3];            // 길이 기반 Array 초기화 (참조형 타입)
        Integer[] integer_array2 = new Integer[]{1, 2, 3, 4, 5}; // 값 기반 Array 초기화 (참조형 타입)

        System.out.println(int_array.length);
        System.out.println(int_array2.length);
        System.out.println(integer_array.length);
        System.out.println(integer_array2.length);

        Member[] members = {
                new Member(1, "Aaron", 10, ""),
                new Member(2, "Baron", 10, ""),
                new Member(3, "Caron", 10, ""),
                new Member(4, "Daron", 10, "")
        };


    }

}
