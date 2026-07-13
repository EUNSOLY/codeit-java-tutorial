package com.example.demo.hero.common;

public interface CrudRepository<T> {
    default void create(T entity) {
        throw new RuntimeException("create 메서드는 구현되지 않았습니다 - 이건 인터페이스 내 디폴트 메서드입니다");
    }

    default T update(T entity) {
        throw new RuntimeException("update 메서드는 구현되지 않았습니다 - 이건 인터페이스 내 디폴트 메서드입니다");
    }

    default void delete(String name) {
        throw new RuntimeException("delete 메서드는 구현되지 않았습니다 - 이건 인터페이스 내 디폴트 메서드입니다");
    }

    T findHeroByName(String slark);
}