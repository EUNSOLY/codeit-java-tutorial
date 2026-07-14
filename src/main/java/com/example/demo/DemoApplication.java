package com.example.demo;

import java.util.*;


//@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        /* Collection 4) Map 세트 */
        Map<Integer, String> string_map = new HashMap<>();          // 빈 Map 선언 (String 요소)
        string_map.put(1, "1");
        string_map.put(2, "2");
        string_map.put(3, "3");

        /* 주의 : Arrays.asList 와 Map.of 으로 생성되는 Collection 은 Immutable 불변성이기에 수정 불가 - replace, put, remove 등 불가 */
//        Map<Integer, String> string_map = Map.of(1, "1", 2, "2", 3, "3");

        string_map.put(4, "4");                     // 추가
        string_map.replace(2, "5");                 // 수정
        string_map.remove(3);                       // 삭제
        string_map.containsKey(1);                  // 포함
        string_map.containsValue("1");              // 포함
        string_map.entrySet();                      // - Entry = [Key, Value] (Set)
        string_map.keySet();                        // - Key (Set)
        string_map.values();                        // - Value (List)
//        string_map.clear();                         // 리셋
        string_map.isEmpty();                       // 검사
        string_map.size();                          // 개수

        System.out.println(string_map.get(1));                          // 조회

        /* Collection 3) Set 세트 */

        //      Set<String> string_set = new HashSet<>();                  // 빈 Set 선언 (String 요소)
        //      string_set.add("1");
        //      string_set.add("2");
        //      string_set.add("3");
//        Set<String> string_set = new HashSet<>(Arrays.asList("1", "2", "3"));

//        string_set.add("4");                        // 추가
//        string_set.remove("1");                  // 삭제
//        string_set.contains("1");                   // 포함
//        string_set.clear();                         // 리셋
//        string_set.isEmpty();                       // 검사
//        System.out.println(string_set.size());
//
//        Set<Integer> integer_set = new HashSet<>(Arrays.asList(1, 2, 3));
//        integer_set.add(4);                         // 추가
//        integer_set.remove(3);                      // 삭제
//        integer_set.contains(1);                    // 포함
//        integer_set.clear();                        // 리셋
//        integer_set.isEmpty();                      // 검사
//        integer_set.size();                         // 개수

//        int[] int_array = new int[3];                        // 길이 기반 Array 초기화 (기본형 타입)
//        int[] int_array2 = {1, 2, 3};                        // 값 기반 Array 초기화 (기본형 타입)
//        Integer[] integer_array = new Integer[3];            // 길이 기반 Array 초기화 (참조형 타입)
//        Integer[] integer_array2 = new Integer[]{1, 2, 3, 4, 5}; // 값 기반 Array 초기화 (참조형 타입)

//        System.out.println(int_array.length);
//        System.out.println(int_array2.length);
//        System.out.println(integer_array.length);
//        System.out.println(integer_array2.length);

//        Member[] members = {
//                new Member(1, "Aaron", 10, ""),
//                new Member(2, "Baron", 10, ""),
//                new Member(3, "Caron", 10, ""),
//                new Member(4, "Daron", 10, "")
//        };


        /* Collection 2 List */

//        List<String> string_list = new ArrayList<>();
//        string_list.add("1");
//        string_list.add("2");
//        string_list.add("3");


//        List<String> string_list = Arrays.asList("1", "2", "3");
//        System.out.println(string_list.get(2)); // 3
//      string_list.add("4");           // 추가 : java.lang.UnsupportedOperationException 에러 발생 (고정길이 배열로 만든 List에 값을 추가하려고 했기 때문)
//      string_list.remove(2);          //  삭제 : java.lang.UnsupportedOperationException 에러 발생 (고정길이 배열로 만든 List에 값을 추가하려고 했기 때문)
//      string_list.clear();            // 리셋 : 오류
//        string_list.set(2, "5");
//        System.out.println(string_list.get(2));  // 5

//        List<Integer> integet_array = Arrays.asList(1, 2, 3); // 고정길이 List 선언 (Arrays는 고정 배열로 asList를 통해 List화 시켰지만 길이는 고정임)
//        List<Integer> integer_list = new ArrayList<>();
//
//        integet_array.get(1);                         // 조회
//        integet_array.set(1, 5);
//        integet_array.sort(Integer::compareTo);
//        integet_array.set(1, 5);                    // 수정
//        integet_array.subList(0, 1);                // 부분
//        integet_array.sort(Integer::compareTo);     // 나열
//        integet_array.contains(4);                  // 포함
//
//        integet_array.isEmpty();                    // 검사
//        integet_array.size();
//        System.out.println(integet_array);
//
//        integer_list.add(1);
//        integer_list.add(2);
//        integer_list.add(3);
//        integer_list.add(4);
//
//        integer_list.get(3);                        // 조회
//        integer_list.add(4);                        // 추가
//        integer_list.set(3, 5);                     // 수정
//        integer_list.remove(3);               // 삭제
//        integer_list.subList(0, 1);                 // 부분
//        integer_list.sort(Integer::compareTo);      // 나열
//        integer_list.contains(1);                   // 포함
//        integer_list.clear();                       // 리셋
//        integer_list.isEmpty();                     // 검사
//        integer_list.size();                        // 개수


    }

}
