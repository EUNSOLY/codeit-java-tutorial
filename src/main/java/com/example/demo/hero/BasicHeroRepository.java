package com.example.demo.hero;

import com.example.demo.hero.common.CrudRepository;
import com.example.demo.hero.common.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class BasicHeroRepository<T extends Hero> implements CrudRepository<T> {
    private List<T> heroes = new ArrayList<>();

    public BasicHeroRepository(List<T> heroes) {
        this.heroes.addAll(heroes);
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
            this.heroes.add(hero);
        } else {
            throw new RuntimeException("이미 존재하는 영웅의 이름입니다! 생성한 영웅 이름 : " + hero.getName());
        }
    }

    @Override
    public void delete(String name) {
        T retrieve = findByName(name);
        if (Objects.isNull(retrieve)) {
            throw new RuntimeException("지우시려는 이름의 영웅이 기존에 없습니다! - 받은 영웅 객체의 이름 : " + name);
        }
        this.heroes.remove(retrieve);
    }
}