package com.sprint.mission.hero.entity;

import com.sprint.mission.hero.common.HeroAbstract;
import lombok.ToString;

// 플레이어가 조작하는 캐릭터입니다.
public class WarriorHero extends HeroAbstract {
    public WarriorHero(String name, int attack) {
        super.name = name;
        super.attack = attack;
        super.hp = 100;
    }

}
