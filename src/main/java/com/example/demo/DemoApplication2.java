package com.example.demo;

//@SpringBootApplication
public class DemoApplication2 {


    // 카트라이더 자동차 레이싱 게임
    public static void main(String[] args) {
        String[] names = new String[]{"Aaron", "Baron"};
        GameTest game = new GameTest(names, 4);
        // 게임을 플레이하고
        String[] result = game.play();
        // 결과를 반환한다
        System.out.println("--- 결과출력 ---");
        System.out.println(result);

        MemberTest member = new MemberTest("11111", "sol", 11);

        member.baaa();
    }
}
