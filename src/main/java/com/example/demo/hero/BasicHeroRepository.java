package com.example.demo.hero;

import com.example.demo.hero.common.CrudRepository;
import com.example.demo.hero.common.Hero;

import java.util.*;

public abstract class BasicHeroRepository<T extends Hero> implements CrudRepository<String, T> {
    private Map<String, T> heroes = new HashMap<>();

    public BasicHeroRepository(List<T> heroes) {
        for (T h : heroes) {
            this.heroes.put(h.getName(), h);
        }

    }

    @Override
    public T findByKey(String name) {
        if (this.heroes.containsKey(name)) {
            return this.heroes.get(name);
        }
        return null;
    }

    @Override
    public void create(T hero) {
        if (Objects.isNull(this.findHeroByKey(hero.getName()))) {
            // null이 맞다면
            this.heroes.put(hero.getName(), hero);
        } else {
            throw new RuntimeException("이미 존재하는 영웅의 이름입니다! 생성한 영웅 이름 : " + hero.getName());
        }
    }

    @Override
    public void delete(String name) {
        T retrieve = findByKey(name);
        if (Objects.isNull(retrieve)) {
            throw new RuntimeException("지우시려는 이름의 영웅이 기존에 없습니다! - 받은 영웅 객체의 이름 : " + name);
        }
        this.heroes.remove(retrieve);
    }
}