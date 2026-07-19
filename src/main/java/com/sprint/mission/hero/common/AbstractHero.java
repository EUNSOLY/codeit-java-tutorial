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
    public void levelUp() {
        this.level++;
    }

    @Override
    public void earnGold(int gold) {
        this.gold += gold;

    }

    @Override
    public void takeDamage(int damage) {
        this.hp -= damage;

    }

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
