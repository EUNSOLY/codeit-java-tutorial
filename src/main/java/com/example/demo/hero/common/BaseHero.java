package com.example.demo.hero.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor

public abstract class BaseHero implements Hero {
    @Getter
    private String name;
}
