package com.example.demo.hero;

import com.example.demo.hero.common.CrudRepository;
import com.example.demo.hero.common.Hero;

import java.util.Arrays;
import java.util.Objects;

public abstract class BasicHeroRepository<T extends Hero> implements CrudRepository<T> {
    private T[] heroes;

    public BasicHeroRepository(T[] heroes) {
        this.heroes = heroes;
    }

    @Override
    public T findHeroByName(String name) {
        for (T each : this.heroes) {
            if (each.getName().equals(name)) {
                return each;
            }
        }
        return null;
    }

    @Override
    public void create(T hero) {
        if (Objects.isNull(this.findHeroByName(hero.getName()))) {
            // null이 맞다면
            T[] newHeroes = Arrays.copyOf(this.heroes, this.heroes.length + 1);
            newHeroes[newHeroes.length - 1] = hero;
            this.heroes = newHeroes;
        } else {
            throw new RuntimeException("이미 존재하는 영웅의 이름입니다! 생성한 영웅 이름 : " + hero.getName());
        }
    }
}