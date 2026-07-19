package com.sprint.mission.hero.common;

import java.util.*;

public abstract class AbstractQuestRepository<T extends AbstractQuest> implements ImplCRUDRepository<T> {
    protected final Map<UUID, T> questRepo = new HashMap<>();

    @Override
    public void create(T t) {
        T newData = questRepo.values().stream()
                .filter(h -> h.getTitle().equals(t.getTitle()))
                .findFirst().orElse(null);
        if (Objects.nonNull(newData)) {
            throw new RuntimeException("이미 있는 퀘스트 이름입니다. 다른 이름을 입력해주세요. 현재 입력 이름 : " + t.getTitle());
        }

        System.out.println("[" + t.getTitle() + "] 퀘스트 생성 성공");
        questRepo.put(t.getId(), t);
    }

    @Override
    public T find(String name) {
        T newData = questRepo.values().stream()
                .filter(h -> h.getTitle().equals(name))
                .findFirst().orElse(null);
        if (Objects.isNull(newData)) {
            throw new RuntimeException("찾으시는 퀘스트가 없습니다. 다른 이름을 입력해주세요. 입력 이름 : " + name);
        }
        System.out.println("[" + newData.getTitle() + "] 특정 퀘스트 조회 성공");
        return questRepo.get(newData.getId());

    }

    @Override
    public List<T> findAll() {
        System.out.println("퀘스트 전체 조회 성공");
        return questRepo.values().stream().toList();
    }

    @Override
    public void update(UUID id, T t) {
        if (!questRepo.containsKey(id)) {
            throw new RuntimeException("현재 선택 된 퀘스트의 정보는 잘못되었습니다 다시 확인 부탁드립니다 : " + t.getTitle());
        }

        questRepo.replace(id, t);
        System.out.println("[" + t.getTitle() + "] 퀘스트 수정 성공");

    }

    @Override
    public void delete(String name) {
        T newData = questRepo.values().stream()
                .filter(h -> h.getTitle().equals(name))
                .findFirst().orElse(null);

        if (Objects.isNull(newData)) {
            throw new RuntimeException("현재 선택 된 퀘스트를 삭제 할 수 없습니다. 다시 확인 부탁드립니다 : " + name);
        }

        System.out.println("[" + newData.getTitle() + "] 퀘스트 삭제 성공");
        questRepo.remove(newData.getId());
    }
}
