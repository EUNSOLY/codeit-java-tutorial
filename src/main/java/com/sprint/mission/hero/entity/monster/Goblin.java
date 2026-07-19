package com.sprint.mission.hero.entity.monster;

import com.sprint.mission.hero.common.AbstractMonster;

public class Goblin extends AbstractMonster {
    public Goblin(String name) {
        super(name, 100, 15, 550);
    }

    @Override
    public int attack() {
        System.out.println("고블린이 공격합니다 드래곤 공격력 : " + super.getAttack());
        return super.getAttack();
    }
}
