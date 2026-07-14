package com.example.demo.hero;

import java.util.List;

public class CacheAgilityHeroRepository extends CacheBasicHeroRepository<AgilityHero> {

    public CacheAgilityHeroRepository(List<AgilityHero> heroes) {
        super(new AgilityHeroRepository(heroes));
    }
}