package com.example.demo;

import com.example.demo.hero.common.Hero;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@RequiredArgsConstructor
public class Player {
    private final int id;
    private final String name;
    private final Side side;
    private final int kill;
    private final int assist;
    private final int death;
    private final Hero pickedHero;
}
