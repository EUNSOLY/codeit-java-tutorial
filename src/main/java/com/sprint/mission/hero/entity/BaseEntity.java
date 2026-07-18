package com.sprint.mission.hero.entity;

import lombok.*;

import java.util.UUID;


@Getter
@ToString
public class BaseEntity {
    private final UUID id;
    private final Long createdAt;
    private Long updatedAt;

    public BaseEntity() {
        this.id = UUID.randomUUID();
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = null;
    }
    
    public void changeUpdateAt() {
        this.updatedAt = System.currentTimeMillis();
    }


}
