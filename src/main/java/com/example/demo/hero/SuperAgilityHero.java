package com.example.demo.hero;

public class SuperAgilityHero extends AgilityHero {
    private final AgilityHero actual;

    public SuperAgilityHero(AgilityHero actual) {
        super(actual.getName());
        this.actual = actual;
    }

    @Override
    public void attack() {
        // 전처리
        actual.attack();
        actual.attack();
        // 후처리
    }

    @Override
    public void ultimate() {
        actual.ultimate();
        actual.ultimate();
        actual.ultimate();
    }
}
