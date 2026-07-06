package com.example.demo;

public class SwitchExample {
    public static void main (String[] args){

        String dayType;
        String day = "SATURDAY";
        // java 14 이전 문법
        switch (day){
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "FRIDAY":
                dayType = "Weekday";
                break;
            case "SATURDAY":
            case "SUNDAY":
                dayType = "Weekend";
                break;
            default:
                dayType = "Unknown";

        }

        System.out.println(dayType);

        // java 14 이후 문법1.
        String dayType2 = switch(day){
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> "Unknown";
        };


        // java 14 이후 문법2.(위에 문법을 더 풀어쓴다면)
        String dayType3 = switch (day){
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> {
                System.out.println("주중이다 공부하자...");
                yield "Weekday";
            }
            case "SATURDAY", "SUNDAY" -> {
                System.out.println("주말이다 놀자!!!!!!");
                yield "Weekday";
            }
            default -> "Unknown";
        };  // 무언가를 대입하는 식(Expression)이므로 끝에 세미콜론(;) 필수!

        System.out.println(dayType2);
        System.out.println(dayType3);

        // java 21 버전
        Object obj ="hello world";
        String formatted = switch (obj) {
            // i, s : 패턴변수(pattern variable)
            case Integer i                   -> String.format("정수입니다: %d", i);
            case String  s when s.length() > 5 -> String.format("5글자가 넘는 긴 문자열: %s", s);
            case String  s                   -> String.format("짧은 문자열: %s", s);
            case null                        -> "값이 비어있습니다."; // 이제 대놓고 null 체크도 가능
                default                          -> "알 수 없는 객체";
        };
        System.out.println(formatted);

    }
}
