package com.example.demo;

public class ConditionExample {
    public static void main(String[] args) {
        int num = 2;
        if (num % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }


        switch (num){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Other");
        }

        String numSwitch = switch (num){
            case 1 -> {
                System.out.println("One");
                yield "값은 : " + num;
            }
            case 2 -> {
                System.out.println("Two");
                yield "값은 : " + num;
            }
            default -> {
                yield "값이 옳지않음";
            }
        };

        System.out.println(numSwitch);
    }
}
