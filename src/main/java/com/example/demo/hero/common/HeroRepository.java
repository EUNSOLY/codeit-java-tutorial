package com.example.demo.hero.common;


// 영웅 저장소
public interface HeroRepository {
    // 영웅 이름을 기반으로 영웅을 찾아서 반환한다.
    Hero findByName(String name);

    default void create(String name) {
        throw new RuntimeException("생성 메서드가 없습니다. 생성해주세요");
    }

    default void update(Hero hero) {
        throw new RuntimeException("업데이트 메서드가 없습니다. 생성해주세요");
    }

    default void delete(String name) {
        throw new RuntimeException("삭제 메서드가 없습니다. 생성해주세요");
    }
}
