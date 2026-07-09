package com.example.demo.hero;

import com.example.demo.hero.common.HeroRepository;

import java.util.HashMap;
import java.util.Map;

public class AgilityHeroRepository implements HeroRepository<AgilityHero, String> {

    public static Map<String, AgilityHero> repository = new HashMap<>();

    @Override
    public AgilityHero findById(String name) {
        return repository.get(name);
    }

    @Override
    public String save(AgilityHero hero) {
        repository.put(hero.getName(), hero); // 영웅 추가
        return hero.getName();
    }


    @Override
    public void delete(String name) {
        repository.remove(name);


    }
}
