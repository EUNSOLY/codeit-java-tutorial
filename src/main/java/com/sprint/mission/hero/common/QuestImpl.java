package com.sprint.mission.hero.common;

import java.util.UUID;

public interface QuestImpl {
    // 이름 변경
    void changeName(String title);

    // 설명 변경
    void changeDesc(String desc);

    // 대결 할 히어로, 몬스터 설정
    void assignHeroAndMonster(UUID heroId, UUID monsterId);

    // 완료 여부 상태 변경
    void changeCompleted();
}
