package com.example.demo.hero;

import com.example.demo.hero.common.Hero;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AgilityHero implements Hero {
    private String name;

    @Override
    public void attack() {
        System.out.println("더블 어택");
    }

    @Override
    public void ultimate() {
        System.out.println("연사");
    }
}
