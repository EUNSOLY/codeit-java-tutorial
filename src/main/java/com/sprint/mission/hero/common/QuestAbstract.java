package com.sprint.mission.hero.common;

import com.sprint.mission.hero.entity.BaseEntity;
import lombok.Getter;

import java.util.UUID;

@Getter
public abstract class QuestAbstract extends BaseEntity implements QuestImpl {
    private String title;
    private String description;
    private UUID heroId;
    private UUID monsterId;
    private boolean completed;

    protected QuestAbstract(String title, String description) {
        super();
        this.title = title;
        this.description = description;

    }

    @Override
    public void changeName(String title) {
        this.title = title;
    }

    @Override
    public void changeDesc(String desc) {
        this.description = desc;
    }

    @Override
    public void changeCompleted() {
        if (this.completed) {
            throw new RuntimeException("이미 완료된 퀘스트 입니다.");
        }
        this.completed = true;
    }

    @Override
    public void assignHeroAndMonster(UUID heroId, UUID monsterId) {
        this.heroId = heroId;
        this.monsterId = monsterId;
    }

    @Override
    public String toString() {
        return String.format(
                "Quest( \n   " +
                        "id=%s, createAt=%s, updateAt=%s \n   " +
                        "title=%s, description=%s, heroId=%s, monsterId=%s, completed=%s \n" +
                        ")\n",
                super.getId(), super.getCreatedAt(), super.getUpdatedAt(),
                this.title, this.description, this.heroId, this.monsterId, this.completed);
    }
}
