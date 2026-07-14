package com.example.demo.hero.common;

public interface CrudRepository<K, V> {
    default void create(V entity) {
        throw new RuntimeException("create 메서드는 구현되지 않았습니다 - 이건 인터페이스 내 디폴트 메서드입니다");
    }

    default V update(V entity) {
        throw new RuntimeException("update 메서드는 구현되지 않았습니다 - 이건 인터페이스 내 디폴트 메서드입니다");
    }

    default void delete(K key) {
        throw new RuntimeException("delete 메서드는 구현되지 않았습니다 - 이건 인터페이스 내 디폴트 메서드입니다");
    }

    default V findHeroByKey(K key) {
        throw new RuntimeException("findHeroByName 메서드는 구현되지 않았습니다 - 이건 인터페이스 내 디폴트 메서드입니다");
    }

    ;

    default V findByKey(K key) {
        throw new RuntimeException("findByName 메서드는 구현되지 않았습니다 - 이건 인터페이스 내 디폴트 메서드입니다");
    }
}