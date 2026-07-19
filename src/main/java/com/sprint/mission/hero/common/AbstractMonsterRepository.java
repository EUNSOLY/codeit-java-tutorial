package com.sprint.mission.hero.common;

import java.util.*;

public abstract class AbstractMonsterRepository<T extends MonsterAbstract> implements CRUDRepository<T> {
    private final Map<UUID, T> monsterRepo = new HashMap<>();

    @Override
    public void create(T t) {
        T newData = monsterRepo.values().stream()
                .filter(h -> h.getName().equals(t.getName()))
                .findFirst().orElse(null);
        if (Objects.nonNull(newData)) {
            throw new RuntimeException("이미 있는 몬스터 이름입니다. 다른 이름을 입력해주세요. 현재 입력 이름 : " + t.getName());
        }

        System.out.println("[" + t.getName() + "] 몬스터 생성 성공");
        monsterRepo.put(t.getId(), t);
    }

    @Override
    public T find(String name) {
        T newData = monsterRepo.values().stream()
                .filter(h -> h.getName().equals(name))
                .findFirst().orElse(null);
        if (Objects.isNull(newData)) {
            throw new RuntimeException("찾으시는 몬스터가 없습니다. 다른 이름을 입력해주세요. 입력 이름 : " + name);
        }
        System.out.println("[" + newData.getName() + "] 특정 몬스터 조회 성공");
        return monsterRepo.get(newData.getId());

    }

    @Override
    public List<T> findAll() {
        System.out.println("몬스터 전체 조회 성공");
        return monsterRepo.values().stream().toList();
    }

    @Override
    public void update(UUID id, T t) {
        if (!monsterRepo.containsKey(id)) {
            throw new RuntimeException("현재 선택 된 몬스터의 정보는 잘못되었습니다 다시 확인 부탁드립니다 : " + t.getName());
        }

        monsterRepo.replace(id, t);
        System.out.println("[" + t.getName() + "] 몬스터 수정 성공");

    }

    @Override
    public void delete(String name) {
        T newData = monsterRepo.values().stream()
                .filter(h -> h.getName().equals(name))
                .findFirst().orElse(null);

        if (Objects.isNull(newData)) {
            throw new RuntimeException("현재 선택 된 몬스터를 삭제 할 수 없습니다. 다시 확인 부탁드립니다 : " + name);
        }

        System.out.println("[" + newData.getName() + "] 몬스터 삭제 성공");
        monsterRepo.remove(newData.getId());
    }
}
