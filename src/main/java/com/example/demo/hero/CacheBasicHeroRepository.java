package com.example.demo.hero;

import com.example.demo.hero.common.CrudRepository;
import com.example.demo.hero.common.Hero;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public abstract class CacheBasicHeroRepository<T extends Hero> implements CrudRepository<T> {
    // 서버 내 캐시라고 가정 : (1) 조회에 드는 시간이 약 0.1초로 짧다고 가정 / (2) 서버 내 캐시는 1회 호출할때마다 비용이 안듬
    private T[] heroes = (T[]) Array.newInstance(Hero.class, 0);
    private final BasicHeroRepository<T> database;

    public CacheBasicHeroRepository(BasicHeroRepository<T> database) {
        this.database = database;
    }

    @Override
    public T findByName(String name) {
        // (1) 캐시에 찾았는데 있으면 그대로 반환
        for (T each : this.heroes) {
            if (each.getName().equals(name)) {
                System.out.println("- 캐시로부터 반환했습니다 : " + name);
                return each;
            }
        }
        // (2) 캐시에 없다면 데이터베이스에서 찾고
        T retrievedFromDatabase = this.database.findByName(name);
        // (2.1) 데이터베이스에 없다면 null 반환
        if (Objects.isNull(retrievedFromDatabase)) {
            System.out.println("- 데이터베이스에 존재하지 않습니다 : " + name);
            return null;
        }
        // (2.2) 데이터베이스에 있다면 캐시 내 저장하고 바로 반환
        T[] newheroes = Arrays.copyOf(heroes, heroes.length + 1);
        System.arraycopy(this.heroes, 0, newheroes, 0, this.heroes.length);
        newheroes[this.heroes.length] = retrievedFromDatabase;
        this.heroes = newheroes;
        System.out.println("- 캐시에는 없지만 데이터베이스에는 존재하여 캐시에 싱크 후 반환합니다 : " + name);
        return retrievedFromDatabase;
    }
}
