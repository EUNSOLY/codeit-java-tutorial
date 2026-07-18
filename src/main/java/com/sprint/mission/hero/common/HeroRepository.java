package com.sprint.mission.hero.common;

import java.util.*;

public abstract class HeroRepository<T extends HeroAbstract> implements CRUDRepository<T> {
    Map<UUID, T> heroRepo = new HashMap<>();

    @Override
    public void create(T t) {
        T newData = heroRepo.values().stream()
                .filter(h -> h.getName().equals(t.getName()))
                .findFirst().orElse(null);
        if (Objects.nonNull(newData)) {
            throw new RuntimeException("이미 있는 영웅이름입니다. 다른 이름을 입력해주세요. 현재 입력 이름 : " + t.getName());
        }

        System.out.println("[" + t.getName() + "] 영웅 생성 성공");
        heroRepo.put(t.getId(), t);
    }

    @Override
    public T find(String name) {
        T newData = heroRepo.values().stream()
                .filter(h -> h.getName().equals(name))
                .findFirst().orElse(null);
        if (Objects.isNull(newData)) {
            throw new RuntimeException("찾으시는 영웅이 없습니다. 다른 이름을 입력해주세요. 입력 이름 : " + name);
        }
        System.out.println("[" + newData.getName() + "] 특정 영웅 조회 성공");
        return heroRepo.get(newData.getId());

    }

    @Override
    public List<T> findAll() {
        System.out.println("영웅 전체 조회 성공");
        return heroRepo.values().stream().toList();
    }

    @Override
    public void update(UUID id, T t) {
        if (!heroRepo.containsKey(id)) {
            throw new RuntimeException("현재 선택 된 영웅의 정보는 잘못되었습니다 다시 확인 부탁드립니다 : " + t.getName());
        }

        heroRepo.replace(id, t);
        System.out.println("[" + t.getName() + "] 영웅 수정 성공");

    }

    @Override
    public void delete(String name) {
        T newData = heroRepo.values().stream()
                .filter(h -> h.getName().equals(name))
                .findFirst().orElse(null);

        if (Objects.isNull(newData)) {
            throw new RuntimeException("현재 선택 된 영웅을 삭제 할 수 없습니다. 다시 확인 부탁드립니다 : " + name);
        }

        System.out.println("[" + newData.getName() + "] 영웅 삭제 성공");
        heroRepo.remove(newData.getId());
    }
}
