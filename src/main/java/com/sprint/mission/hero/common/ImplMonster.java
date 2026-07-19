package com.sprint.mission.hero.common;

public interface ImplMonster {
    // 이름 변경
    void changeName(String name);

    // 공격력 변경
    void changeAttack(int attack);

    // 처치 보상금
    void changeRewardGold(int rewardGold);

    // 체력 변경
    void changeHp(int hp);

    // 공격을 받아 체력이 감소합니다.
    void takeDamage(int damage);
}
