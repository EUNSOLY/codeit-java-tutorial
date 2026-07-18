package com.sprint.mission.hero.entity;

import com.sprint.mission.hero.common.IfBaseEntity;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;


@Getter
@ToString
public class BaseEntity implements IfBaseEntity {
    private final UUID id;
    private final Long createdAt;
    private Long updatedAt;

    public BaseEntity() {
        this.id = UUID.randomUUID();
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = null;
    }

    @Override
    public UUID getUUid() {
        return this.id;
    }

    @Override
    public Long getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public void changeUpdateAt() {
        this.updatedAt = System.currentTimeMillis();
    }


}
