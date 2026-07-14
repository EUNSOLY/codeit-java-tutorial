package com.example.demo.hero;


import com.example.demo.hero.common.Hero;

import java.util.List;


public class AgilityHeroRepository extends BasicHeroRepository<AgilityHero> {
    public AgilityHeroRepository(List<AgilityHero> heroes) {
        super(heroes);
    }
}
