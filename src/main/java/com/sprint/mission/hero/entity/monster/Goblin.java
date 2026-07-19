package com.sprint.mission.hero.entity.monster;

import com.sprint.mission.hero.common.MonsterAbstract;

public class Goblin extends MonsterAbstract {
    public Goblin(String name) {
        super(name, 100, 15, 550);
    }

    @Override
    public int attack() {
        System.out.println("고블린이 공격합니다 드래곤 공격력 : " + super.getAttack());
        return super.getAttack();
    }
}
