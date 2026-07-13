package com.example.demo.ramen;

public abstract class MakingRamen { // 태생 자체가 객체화해서 사용할 수 있는 클래스가 아니라 상속받아 사용해야하는 클래스

    // 내부에서 로직을 자유롭게 개발할 수 있는 전략 패턴과 달리
    // 템플릿 메서드 패턴은 "로직을 고정하고" 일부의 요소에 대해서만 외부에서 개발하도록한다
    // 로직을 고정하고 물 / 스프 / 면만을 외부에서 결정하도록 한다
    public final void boiling() {
        System.out.println(" HTTP 유저로부터 요청을 받아서 HTTP 정보를 담는 객체를 만든다");
        System.out.println(" 어떤 API 호출인지 검색한다 " + this.water());
        System.out.println(" 검색된 여러분들이 개발했던 API 하나를 골라서 실행한다 " + this.soup());
        System.out.println(" API 결과를 HTTP 반환하기 위한 데이터로 변환을한다 " + this.noodle());
        System.out.println(" 페이지가 필요하다면 페이지를 서버에서 렌더링한다 ");
    } //


    protected abstract String water();

    protected abstract String soup();

    protected abstract String noodle();
}
