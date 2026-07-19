package com.sprint.mission.hero.common;

import java.util.List;
import java.util.UUID;

public interface ImplCRUDRepository<T> {
    // 생성
    void create(T t);

    // 단건 조회
    T find(String name);

    // 전체 조회
    List<T> findAll();

    // 수정
    void update(UUID id, T t);

    // 삭제
    void delete(String name);
}
