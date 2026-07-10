package com.example.demo.hero.common;


// 인터페이스'만' '다중 상속'이 가능
// 클래스는 다중 상속이 되지않지만 인터페이스는 여러 인터페이스를 조합할 수 있도록 예외적으로 허용
public interface Hero extends HeroAttack, HeroUltimate {


}

