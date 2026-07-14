package com.example.demo;


import com.example.demo.member.Member;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        int[] int_array = new int[3];                        // 길이 기반 Array 초기화 (기본형 타입)
        int[] int_array2 = {1, 2, 3};                        // 값 기반 Array 초기화 (기본형 타입)
        Integer[] integer_array = new Integer[3];            // 길이 기반 Array 초기화 (참조형 타입)
        Integer[] integer_array2 = new Integer[]{1, 2, 3, 4, 5}; // 값 기반 Array 초기화 (참조형 타입)

//        System.out.println(int_array.length);
//        System.out.println(int_array2.length);
//        System.out.println(integer_array.length);
//        System.out.println(integer_array2.length);

        Member[] members = {
                new Member(1, "Aaron", 10, ""),
                new Member(2, "Baron", 10, ""),
                new Member(3, "Caron", 10, ""),
                new Member(4, "Daron", 10, "")
        };


        /* Collection 2 List */

//        List<String> string_list = new ArrayList<>();
//        string_list.add("1");
//        string_list.add("2");
//        string_list.add("3");


        List<String> string_list = Arrays.asList("1", "2", "3");
        System.out.println(string_list.get(2)); // 3
//      string_list.add("4");           // 추가 : java.lang.UnsupportedOperationException 에러 발생 (고정길이 배열로 만든 List에 값을 추가하려고 했기 때문)
//      string_list.remove(2);          //  삭제 : java.lang.UnsupportedOperationException 에러 발생 (고정길이 배열로 만든 List에 값을 추가하려고 했기 때문)
//      string_list.clear();            // 리셋 : 오류
        string_list.set(2, "5");
        System.out.println(string_list.get(2));  // 5

        List<Integer> integet_array = Arrays.asList(1, 2, 3); // 고정길이 List 선언 (Arrays는 고정 배열로 asList를 통해 List화 시켰지만 길이는 고정임)
        List<Integer> integer_list = new ArrayList<>();

        integet_array.get(1);                         // 조회
        integet_array.set(1, 5);
        integet_array.sort(Integer::compareTo);
        integet_array.set(1, 5);                    // 수정
        integet_array.subList(0, 1);                // 부분
        integet_array.sort(Integer::compareTo);     // 나열
        integet_array.contains(4);                  // 포함

        integet_array.isEmpty();                    // 검사
        integet_array.size();
        System.out.println(integet_array);


    }

}
