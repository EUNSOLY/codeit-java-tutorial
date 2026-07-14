package com.example.demo.hero;

import com.example.demo.hero.common.CrudRepository;
import com.example.demo.hero.common.Hero;

import java.util.*;

public abstract class CacheBasicHeroRepository<T extends Hero> implements CrudRepository<String, T> {
    // 서버 내 캐시라고 가정 : (1) 조회에 드는 시간이 약 0.1초로 짧다고 가정 / (2) 서버 내 캐시는 1회 호출할때마다 비용이 안듬
    private final Map<String, T> heroes = new HashMap<>();
    private final BasicHeroRepository<T> database;

    public CacheBasicHeroRepository(BasicHeroRepository<T> database) {
        this.database = database;
    }

    @Override
    public T findByKey(String name) {
        // (1) 캐시에 찾았는데 있으면 그대로 반환
        if (this.heroes.containsKey(name)) {
            System.out.println("- 캐시로부터 반환했습니다 : " + name);
            return this.heroes.get(name);
        }
        // (2) 캐시에 없다면 데이터베이스에서 찾고
        T retrievedFromDatabase = this.database.findByKey(name);
        // (2.1) 데이터베이스에 없다면 null 반환
        if (Objects.isNull(retrievedFromDatabase)) {
            System.out.println("- 데이터베이스에 존재하지 않습니다 : " + name);
            return null;
        }
        // (2.2) 데이터베이스에 있다면 캐시 내 저장하고 바로 반환
        this.heroes.put(retrievedFromDatabase.getName(), retrievedFromDatabase);
        System.out.println("- 캐시에는 없지만 데이터베이스에는 존재하여 캐시에 싱크 후 반환합니다 : " + name);
        return retrievedFromDatabase;
    }

}
