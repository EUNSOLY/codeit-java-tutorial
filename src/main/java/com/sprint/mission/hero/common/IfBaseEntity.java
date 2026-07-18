package com.sprint.mission.hero.common;

import java.util.UUID;

public interface IfBaseEntity {
    UUID getUUid();

    Long getCreatedAt();

    Long getUpdatedAt();

    void changeUpdateAt();
}