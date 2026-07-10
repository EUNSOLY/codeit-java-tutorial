package com.example.demo;

public class MemberTest {
    private final String citizen;
    private String name;
    private int age;

    public MemberTest(String citizen, String name, int age) {
        this.citizen = citizen;
        this.name = name;
        this.age = age;

    }

    // 그냥 단순히 setAge를 나는구현함
    // 강사님이 왈 100살 넣으면 어떻게할것이냐 -> 예외처리를 하면 -> 굳이 그러지말고 나이는 '1'살 씩 먹으니 생일이라는 함수를 만들어서
    // 다른 거 없이 호출하면 1살만 먹을 수 있도록 애초에 메서드를 구성하면 되는 것이라고 얘기해주심
    // 생각지도 못한 방향성이였다.. 굳굳..!!!
//    public void setAge(int age) {
//        this.age = age;
//    }

    public void baaa() {
        this.age += 1;
    }


}
