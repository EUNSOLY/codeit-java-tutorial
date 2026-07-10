package com.example.demo.hero;

import com.example.demo.hero.common.BaseHero;
import com.example.demo.hero.common.Hero;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


public class IntelligenceHero extends BaseHero {

    public IntelligenceHero(String name) {
        super(name);

    }

    @Override
    public void attack() {
        System.out.println("파이어볼");
    }

    @Override
    public void ultimate() {
        System.out.println("메테오");
    }
}
