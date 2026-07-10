package com.example.demo.hero;

import com.example.demo.hero.common.Hero;
import com.example.demo.hero.common.HeroRepository;

import java.util.Objects;

public class AgilityHeroRepository implements HeroRepository {
    private AgilityHero[] agilityHeroes = new AgilityHero[]{
            new AgilityHero("Slark"),
            new AgilityHero("Juggernaut"),
            new AgilityHero("Draw Ranger")
    };

    @Override
    public Hero findByName(String name) {
        for (AgilityHero a : agilityHeroes) {
            if (!Objects.isNull(a) && a.getName().equals(name)) {
                return a;
            }
        }
        throw new RuntimeException("당신이 찾는 영웅이 없습니다. : " + name);
    }


    @Override
    public void delete(String name) {
        for (int i = 0; i < agilityHeroes.length; i++) {
            if (!Objects.isNull(agilityHeroes[i]) && agilityHeroes[i].getName().equals(name)) {
                agilityHeroes[i] = null;
                return;
            }
        }
        throw new RuntimeException("삭제할 영웅이 없습니다. : " + name);
    }


}
