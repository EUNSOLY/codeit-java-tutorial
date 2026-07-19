package com.sprint.mission.hero.repository.quest;

import com.sprint.mission.hero.common.AbstractQuestRepository;
import com.sprint.mission.hero.common.AbstractQuest;

import java.util.List;
import java.util.UUID;

public class QuestRepository<T extends AbstractQuest> extends AbstractQuestRepository<T> {

    // 특정 히어로 퀘스트 가져오기
    public List<T> findAllByHeroQuest(UUID heroId) {
        List<T> newList = super.findAll().stream().toList();

        return newList.stream()
                .filter(t -> t.getHeroId().equals(heroId))
                .toList();
    }
}
