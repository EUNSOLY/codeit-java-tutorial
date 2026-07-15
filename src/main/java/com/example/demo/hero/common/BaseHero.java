package com.example.demo.hero.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public abstract class BaseHero implements Hero {
    @Getter
    private String name;
}
