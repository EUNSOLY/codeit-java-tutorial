package com.example.demo.hero;

import com.example.demo.hero.common.Hero;
import com.example.demo.hero.common.HeroRepository;

public class AgilityHeroRepository implements HeroRepository {
    private AgilityHero[] agilityHeroes = new AgilityHero[]{
            new AgilityHero("Slark"),
            new AgilityHero("Juggernaut"),
            new AgilityHero("Draw Ranger")
    };

    @Override
    public Hero findByName(String name) {
        for (AgilityHero a : agilityHeroes) {
            if (a.getName().equals(name)) {
                return a;
            }
        }
        throw new RuntimeException("당신이 찾는 영웅이 없습니다. : " + name);
    }
}
