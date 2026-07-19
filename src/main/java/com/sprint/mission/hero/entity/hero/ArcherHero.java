package com.sprint.mission.hero.entity.hero;

import com.sprint.mission.hero.common.HeroAbstract;

// 플레이어가 조작하는 캐릭터입니다.
public class ArcherHero extends HeroAbstract {
    public ArcherHero(String name, int attack, int hp) {
        super.changeName(name);
        super.changeAttack(attack);
        super.changeHp(hp);
    }
}
