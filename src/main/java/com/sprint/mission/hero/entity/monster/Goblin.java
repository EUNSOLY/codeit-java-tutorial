package com.sprint.mission.hero.entity.monster;

import com.sprint.mission.hero.common.MonsterAbstract;

public class Goblin extends MonsterAbstract {
    public Goblin(String name) {
        super.changeName(name);
        super.changeHp(1500); // 고블린 체력
        super.changeAttack(150); // 고블린 공격력
        super.changeRewardGold(150); // 고블린 처치 시 획든 골드
    }
}
