package com.sprint.mission.hero.common;


import com.sprint.mission.hero.entity.BaseEntity;
import lombok.Getter;

@Getter
public abstract class MonsterAbstract extends BaseEntity implements MonsterImpl {
    private String name; // 이름
    private int hp; // 체력
    private final int attack; // 공격력
    private final int rewardGold; // 처치 시 획득하는 골드

    protected MonsterAbstract(String name, int hp, int attack, int rewardGold) {
        super();
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.rewardGold = rewardGold;
    }

    @Override
    public void changeName(String name) {
        this.name = name;
    }

    @Override
    public void takeDamage(int damage) {
        System.out.println(this.name + "가 데미지를 받았습니다 체력이 " + damage + "만큼 감소합니다.");
        this.hp -= damage;
    }

    // 몬스터가 죽으면 몬스터 처치 보상금 반환
    @Override
    public int claimRewardGold() {
        return this.rewardGold;
    }

    @Override
    public String toString() {
        return String.format(
                "Monster( \n   " +
                        "id=%s, createAt=%s, updateAt=%s \n   " +
                        "name=%s, hp=%s, attack=%s, rewardGold=%s" +
                        ")\n",
                super.getId(), super.getCreatedAt(), super.getUpdatedAt(),
                this.name, this.hp, this.attack, this.rewardGold);
    }

}
