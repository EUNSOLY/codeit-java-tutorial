package com.example.demo;

import com.example.demo.member.Member;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        /* Collection 1) Array 배열 */
//      String[] string_array = new String[3];                      // 길이 기반 Array 선언 (String 요소)
        String[] string_array = new String[]{"1", "2", "3"};        // 값 기반 Array 선언 (String 요소)
        String[] stringArr = new String[]{"4","5","6"};
        System.out.println(string_array.length);
        System.out.println(stringArr.length);
//      Integer[] integer_array = new Integer[3];                   // 길이 기반 Array 선언 (Integer 요소)
        Integer[] integer_array = new Integer[]{1, 2, 3};           // 값 기반 Array 선언 (Integer 요소)
        Integer[] intArr = new Integer[]{1,2,3,4};
        System.out.println(integer_array.length);
        System.out.println(intArr.length);

        System.out.println(string_array);
        System.out.println(integer_array);
        System.out.println("========");
        System.out.println(stringArr);
        System.out.println(intArr);

        Member[] members = {
                new Member("이름1", "email1"),
                new Member("이름2", "email2"),
                new Member("이름3", "email3"),
                new Member("이름4", "email4"),
                new Member("이름5", "email5")
        };

        System.out.println(members.length);

        for (Member m : members){
            System.out.println(m.getName());
        }

        System.out.println(Arrays.toString( members));

        int[] scores = {88, 92, 76};
        System.out.println(scores.length);
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println("--===========");

        Member[][] members2 = {
                {new Member("Aaron", "Aaron"), new Member("Baron", "Baron")},
                {new Member("Caron", "Caron"), new Member("Daron", "Daron")},
                {new Member("Earon", "Earon"), new Member("Faron", "Faron")},
                {new Member("Garon", "Garon"), new Member("Haron", "Haron")},
        };

        for (int i = 0; i < members2.length; i++){
            for(int j =0; j < members2[i].length; j++){
                System.out.println(members2[i][j]);
            }
        }

    }
}
