package com.sprint.mission.hero.common;

import com.sprint.mission.hero.entity.BaseEntity;

import java.util.*;

public abstract class RepositoryAbstract<T extends BaseEntity> implements RepositoryImpl<T> {
    protected final Map<UUID, T> repo = new HashMap<>();

    @Override
    public void save(T t) {
        System.out.println("생성 성공");
        repo.put(t.getId(), t);
    }

    @Override
    public T find(UUID id) {
        if (!repo.containsKey(id)) {
            throw new RuntimeException("찾으시는 데이터가 존재하지 않습니다.");
        }
        return repo.get(id);

    }

    @Override
    public List<T> findAll() {
        System.out.println("전체 조회 성공");
        return repo.values().stream().toList();
    }

    @Override
    public void update(UUID id, T t) {
        if (!repo.containsKey(id)) {
            throw new RuntimeException("잘못된 ID 값 입니다. 다시 확인해주세요.");
        }
        repo.replace(id, t);
        System.out.println("수정 성공");
    }

    @Override
    public void delete(UUID id) {
        if (!repo.containsKey(id)) {
            throw new RuntimeException("잘못된 ID 값 입니다. 다시 확인해주세요.");
        }
        System.out.println("영웅 삭제 성공");
        repo.remove(id);
    }
}
