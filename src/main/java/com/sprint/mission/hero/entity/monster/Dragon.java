package com.sprint.mission.hero.entity.monster;

import com.sprint.mission.hero.common.MonsterAbstract;

public class Dragon extends MonsterAbstract {
    public Dragon(String name) {
        super(name, 100, 12, 500);
    }

    @Override
    public int attack() {
        System.out.println(super.getName() + "드래곤이 공격합니다 드래곤 공격력 : " + super.getAttack());
        return super.getAttack();
    }
}
