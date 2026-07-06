package com.example.demo;

public class ForExample {
    public static void main(String[] args) {

        // 일반 for문
        for(int i = 0; i < 10; i ++){
            System.out.println(i);
        }

        // 중첩 for문
        for(int i = 1; i <=3; i++){
            for(int j = 1; j <=2; j++){
                System.out.println("i=" + i +", j=" + j);
            }
        }

        // 향상된 for 문
        int[] scores = {90,40,54};
        for(int s : scores){
            System.out.println("점수" + s);
        }

    }
}
