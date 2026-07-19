package com.sprint.mission.hero.common;

public interface QuestImpl {
    // 이름 변경
    void changeName(String title);

    // 설명 변경
    void changeDesc(String desc);

    // 완료 여부 상태 변경
    void changeCompleted();
}
