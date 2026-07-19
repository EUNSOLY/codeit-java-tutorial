package com.sprint.mission.hero.entity.hero;

import com.sprint.mission.hero.common.AbstractHero;

// 전사
public class WarriorHero extends AbstractHero {
    public static final int INIT_HP = 100;
    public static final int INIT_ATTACK = 25;

    public WarriorHero(String name) {
        super(name, INIT_HP, INIT_ATTACK);
    }

    @Override
    public int attack() {
        System.out.println(super.getName() + "전사님이 공격을 시전합니다. 공격력은 : " + super.getAttack() + "입니다.");
        return super.getAttack();

    }
}
