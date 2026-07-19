package com.sprint.mission.hero.common;


import com.sprint.mission.hero.entity.BaseEntity;
import lombok.Getter;

@Getter
public abstract class MonsterAbstract extends BaseEntity implements MonsterImpl {
    private String name; // 이름
    private int hp; // 체력
    private int attack; // 공격력
    private int rewardGold; // 처치 시 획득하는 골드

    @Override
    public void changeName(String name) {
        this.name = name;
    }

    @Override
    public void changeAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public void changeHp(int hp) {
        this.hp = hp;
    }


    @Override
    public void takeDamage(int damage) {
        this.hp -= damage;

    }

    @Override
    public String toString() {
        return String.format(
                "Monster( \n   " +
                        "id=%s, createAt=%s, updateAt=%s \n   " +
                        "name=%s, hp=%s, attack=%s, rewardGold=%s)",
                super.getId(), super.getCreatedAt(), super.getUpdatedAt(),
                this.name, this.hp, this.attack, this.rewardGold);
    }

}
