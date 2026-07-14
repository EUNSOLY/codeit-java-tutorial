package com.example.demo.hero;

public class CacheAgilityHeroRepository extends CacheBasicHeroRepository<AgilityHero> {

    public CacheAgilityHeroRepository(AgilityHero[] heroes) {
        super(new AgilityHeroRepository(heroes));
    }
}