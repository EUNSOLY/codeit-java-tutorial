package com.sprint.mission.hero.common;

import com.sprint.mission.hero.entity.BaseEntity;
import lombok.Getter;

@Getter
public abstract class AbstractHero extends BaseEntity implements ImplHero {
    private String name;
    private int level;
    private int hp;
    private int attack;
    private int gold;

    protected AbstractHero(String name, int hp, int attack) {
        super();
        this.level = 1;
        this.name = name;
        this.hp = hp;
        this.attack = attack;

    }

    @Override
    public void changeName(String name) {
        this.name = name;
    }

    @Override
    public void levelUp() {
        this.level++; // 레벨업
        this.hp += 50; // 레벨 증가 시 체력 자동 50 증가
        this.attack += 20; // 레벨 증가 시 공격력도 자동 20 증가
    }

    @Override
    public void earnGold(int gold) {
        this.gold += gold;
    }

    // 공격 받기
    @Override
    public void takeDamage(int damage) {
        System.out.println(this.name + "가 데미지를 받았습니다 체력이 " + damage + "만큼 감소합니다.");
        this.hp -= damage;
    }

    // 체력 증가
    @Override
    public void heal(int hp) {
        this.hp += hp;
    }

    @Override
    public String toString() {
        return String.format(
                "Hero( \n   " +
                        "id=%s, createAt=%s, updateAt=%s \n   " +
                        "name=%s, level=%s, hp=%s, attack=%s, gold=%s" +
                        ")\n",
                super.getId(), super.getCreatedAt(), super.getUpdatedAt(),
                this.name, this.level, this.hp, this.attack, this.gold);
    }

}
