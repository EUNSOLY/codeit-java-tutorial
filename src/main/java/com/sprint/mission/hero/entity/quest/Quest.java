package com.sprint.mission.hero.entity.quest;

import com.sprint.mission.hero.common.QuestAbstract;

import java.util.UUID;

public class Quest extends QuestAbstract {
    public Quest(String title, String description, UUID heroId, UUID monsterId) {
        super(title, description, heroId, monsterId);
    }

}
