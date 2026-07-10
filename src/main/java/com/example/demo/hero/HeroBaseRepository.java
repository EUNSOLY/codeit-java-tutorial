package com.example.demo.hero;

import com.example.demo.hero.common.Hero;
import com.example.demo.hero.common.HeroRepository;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public abstract class HeroBaseRepository implements HeroRepository {
    private Hero[] heroes = new Hero[]{};

    @Override
    public Hero[] getHeroes() {
        return this.heroes;
    }

    @Override
    public Hero findByName(String name) {
        for (Hero a : heroes) {
            if (!Objects.isNull(a) && a.getName().equals(name)) {
                return a;
            }
        }
        return null;
    }

    @Override
    public void create(Hero hero) {
        if (Objects.isNull(this.findByName(hero.getName()))) {
            // null이 맞다면
            Hero[] newHeroes = Arrays.copyOf(this.heroes, this.heroes.length + 1);
            newHeroes[newHeroes.length - 1] = hero;
            this.heroes = newHeroes;
        } else {
            throw new RuntimeException("이미 존재하는 영웅의 이름입니다! 생성한 영웅 이름 : " + hero.getName());
        }
    }


    @Override
    public void delete(String name) {

        if (Objects.nonNull(findByName(name))) {
            this.heroes = Arrays.stream(this.heroes)
                    .filter(h -> !h.getName().equals(name))
                    .toArray(Hero[]::new);
            return;
        }
//        if (Objects.nonNull(findByName(name))) {

        // Arrays.copyOfRange()
        // 원본배열, 복사를 시작할 원본 배열의 인덱스, 복사 대상 배열, 복사를 시작할 대상 배열의 인덱스, 복사할 요소의 개수
        // System.arraycopy();
        // 원본배열, 복사를 시작할 원본 배열의 인덱스, 복사 대상 배열, 복사를 시작할 대상 배열의 인덱스, 복사할 요소의 개수
//            for (int i = 0; i < this.heroes.length; i++) {
//                if (this.heroes[i].getName().equals(name)) {
//                    int position = i == 0 ? 0 : i - 1;
//                    Hero[] arr1 = Arrays.copyOfRange(this.heroes, 0, position); // 0부터 position 앞 요소까지만 복사
//                    Hero[] arr2 = Arrays.copyOfRange(this.heroes, i + 1, this.heroes.length); // position 부터 마지막 요소까지 복사(길이의 앞 요소는 마지막 요소)
//                    Hero[] result = new Hero[arr1.length + arr2.length]; // 쪼개기한 배열을 합산 길이로 신규 배열 생성
//                    System.arraycopy(arr1, 0, result, 0, arr1.length); // 앞쪽
//                    System.arraycopy(arr2, arr1.length, result, arr1.length, arr2.length); // 뒷쪽
//                    this.heroes = result;
//                    return;
//                }
//            }
//        }


        throw new RuntimeException("삭제할 영웅이 없습니다. : " + name);
    }
}
