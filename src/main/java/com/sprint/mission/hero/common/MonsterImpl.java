package com.sprint.mission.hero.common;

public interface MonsterImpl {
    // 이름 변경
    void changeName(String name);

    // 처치 보상금
    int claimRewardGold();

    // 공격을 받아 체력이 감소합니다.
    void takeDamage(int damage);

    // 공격
    int attack();

}
