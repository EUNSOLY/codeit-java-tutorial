package com.example.demo;

public class GameTest {
    // *** 변수 선언부 ***
    // 자동차 닉네임들을 데이터를 받고
    String[] name;
    // 몇 판을 할지 데이터를 받고
    int count;

    public GameTest(String[] name, int count) {
        this.name = name;
        this.count = count;

    }

    public String[] play() {
        System.out.println("--- 플레이어들 ---");
        for (String each : this.name) {
            System.out.println(each);
        }
        System.out.println("--- 게임끝 ---");
        return new String[]{"Aaron", "2시 10분 10초", "아이템 사용 총 10건"};
    }


}
