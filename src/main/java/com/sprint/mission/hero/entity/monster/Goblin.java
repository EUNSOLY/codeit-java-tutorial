package com.sprint.mission.hero.entity.monster;

import com.sprint.mission.hero.common.AbstractMonster;

public class Goblin extends AbstractMonster {
    public Goblin(String name, int attack, int gold) {
        super.changeName(name);
        super.changeHp(1500); // 고블린 체력
        super.changeAttack(attack); // 고블린 공격력
        super.changeRewardGold(gold); // 고블린 처치 시 획든 골드
    }
}
