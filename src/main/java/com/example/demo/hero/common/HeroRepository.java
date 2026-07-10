package com.example.demo.hero.common;


// 영웅 저장소
public interface HeroRepository {
    // 영웅 이름을 기반으로 영웅을 찾아서 반환한다.
    Hero findByName(String name);
}
