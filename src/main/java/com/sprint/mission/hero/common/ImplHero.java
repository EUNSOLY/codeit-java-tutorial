package com.sprint.mission.hero.common;

public interface ImplHero {
    // 이름 변경
    void changeName(String name);

    // 레벨 증가
    void levelUp();

    // 골드 획득
    void earnGold(int gold);

    // 공격을 받아 체력을 감소시킴
    void takeDamage(int damage);

    // 체력 회복
    void heal(int hp);

    // 공격
    int attack();
}
