package com.sprint.mission.hero.entity.hero;

import com.sprint.mission.hero.common.HeroAbstract;

// 마법사
public class MageHero extends HeroAbstract {
    public static final int INIT_HP = 100;
    public static final int INIT_ATTACK = 15;

    public MageHero(String name) {
        super(name, INIT_HP, INIT_ATTACK);
    }

    @Override
    public int attack() {
        System.out.println(super.getName() + "마법사님이 공격을 시전합니다. 공격력은 : " + super.getAttack() + "입니다.");
        return super.getAttack();

    }
}
