package com.example.demo.hero;


import com.example.demo.hero.common.Hero;


public class AgilityHeroRepository<T extends Hero> extends BasicHeroRepository<T> {
    public AgilityHeroRepository(T[] heroes) {
        super(heroes);
    }


}
