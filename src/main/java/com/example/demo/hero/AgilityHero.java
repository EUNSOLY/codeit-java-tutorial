package com.example.demo.hero;

import com.example.demo.hero.common.BaseHero;
import com.example.demo.hero.common.Hero;
import lombok.AllArgsConstructor;
import lombok.Getter;

public class AgilityHero extends BaseHero {

    public AgilityHero(String name) {
        super(name);

    }

    @Override
    public void attack() {
        System.out.println("더블 어택");
    }

    @Override
    public void ultimate() {
        System.out.println("연사");
    }
}
