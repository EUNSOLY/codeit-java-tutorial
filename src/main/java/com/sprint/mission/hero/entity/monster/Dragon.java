package com.sprint.mission.hero.entity.monster;

import com.sprint.mission.hero.common.AbstractMonster;

public class Dragon extends AbstractMonster {
    public Dragon(String name) {
        super.changeName(name);
        super.changeHp(3000); // 드래곤 체력
        super.changeAttack(200); // 드래곤 공격력
        super.changeRewardGold(200); // 드래곤 처치 시 획든 골드

    }
}
