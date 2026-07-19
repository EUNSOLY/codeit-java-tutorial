package com.sprint.mission.hero;


import com.sprint.mission.hero.entity.hero.ArcherHero;
import com.sprint.mission.hero.entity.hero.MageHero;
import com.sprint.mission.hero.entity.hero.WarriorHero;
import com.sprint.mission.hero.entity.monster.Dragon;
import com.sprint.mission.hero.entity.monster.Goblin;
import com.sprint.mission.hero.entity.quest.Quest;
import com.sprint.mission.hero.repository.*;

import java.util.Comparator;
import java.util.List;

public class DemoApplication {
    public static void main(String[] args) {

        // Hero
        WarriorHero heroAaron = new WarriorHero("Aaron", 10000, 1000);
        WarriorHero heroLeon = new WarriorHero("Leon", 8500, 950);
        WarriorHero heroCaron = new WarriorHero("Caron", 8500, 950);

        MageHero heroMerlin = new MageHero("Merlin", 6500, 1800);
        MageHero heroLuna = new MageHero("Luna", 7000, 1700);

        ArcherHero heroRobin = new ArcherHero("Robin", 7500, 1400);
        ArcherHero heroSylvia = new ArcherHero("Sylvia", 7200, 1500);

        // Monster
        Goblin goblinKing = new Goblin("Goblin King", 100, 50);
        Goblin goblinWarrior = new Goblin("Goblin Warrior", 80, 20);
        Goblin goblinShaman = new Goblin("Goblin Shaman", 70, 10);
        Goblin goblinTest = new Goblin("Goblin Test", 200, 120);

        Dragon redDragon = new Dragon("Red Dragon");
        Dragon blackDragon = new Dragon("Black Dragon");
        Dragon ancientDragon = new Dragon("Ancient Dragon");

        // Quest
        Quest goblinHuntQuest = new Quest(
                "고블린 토벌",
                "고블린 마왕을 처치하여 마을의 평화를 되찾으세요."
        );
        Quest villageDefenseQuest = new Quest(
                "마을 방어",
                "마을을 습격한 고블린 무리를 모두 처치하세요."

        );

        Quest dragonSlayerQuest = new Quest(
                "드래곤 토벌",
                "붉은 드래곤을 처치하여 왕국을 구하세요."
        );

        WarriorHeroRepository warriorHeroRepository = new WarriorHeroRepository();
        MageHeroRepository mageHeroRepository = new MageHeroRepository();
        ArcherHeroRepository archerHeroRepository = new ArcherHeroRepository();

        MonsterRepository<Goblin> goblinMonsterRepository = new MonsterRepository<>();
        MonsterRepository<Dragon> dragonMonsterRepository = new MonsterRepository<>();

        QuestRepository<Quest> questRepository = new QuestRepository<>();


        // 히어로 저장
        warriorHeroRepository.create(heroAaron);
        warriorHeroRepository.create(heroLeon);
        warriorHeroRepository.create(heroCaron);

        mageHeroRepository.create(heroMerlin);
        mageHeroRepository.create(heroLuna);

        archerHeroRepository.create(heroRobin);
        archerHeroRepository.create(heroSylvia);

        // 몬스터 저장
        goblinMonsterRepository.create(goblinKing);
        goblinMonsterRepository.create(goblinWarrior);
        goblinMonsterRepository.create(goblinShaman);
        goblinMonsterRepository.create(goblinTest);

        dragonMonsterRepository.create(redDragon);
        dragonMonsterRepository.create(blackDragon);
        dragonMonsterRepository.create(ancientDragon);

        // 퀘스트 저장
        questRepository.create(goblinHuntQuest);
        questRepository.create(villageDefenseQuest);
        questRepository.create(dragonSlayerQuest);

        //heroCaron
//        System.out.println(warriorHeroRepository.find("Caron"));
//        System.out.println("전체 조회");
//        System.out.println(warriorHeroRepository.findAll());
//        WarriorHero newHeroCaron = warriorHeroRepository.find("Caron");
//        newHeroCaron.changeName("바보야");
//        System.out.println("수정 후 전체 조회");
//        System.out.println(warriorHeroRepository.findAll());
//        warriorHeroRepository.delete("바보야");
//        System.out.println("삭제 후 전체 조회");
//        System.out.println(warriorHeroRepository.findAll());

        // Goblin Test
//        System.out.println(goblinMonsterRepository.find("Goblin Test"));
//        System.out.println("전체 조회");
//        System.out.println(goblinMonsterRepository.findAll());
//        WarriorHero newGoblin = warriorHeroRepository.find("Goblin Test");
//        newGoblin.changeName("바보야");
//        System.out.println("수정 후 전체 조회");
//        System.out.println(warriorHeroRepository.findAll());
//        warriorHeroRepository.delete("바보야");
//        System.out.println("삭제 후 전체 조회");
//        System.out.println(warriorHeroRepository.findAll());

        // 레벨 높은 순 조회
        List<WarriorHero> sortLevelHero = warriorHeroRepository.findAll().stream()
                .sorted(new Comparator<WarriorHero>() {
                    @Override
                    public int compare(WarriorHero o1, WarriorHero o2) {
                        return o2.getLevel() - o1.getLevel();
                    }
                })
                .toList();

        System.out.println(sortLevelHero);


        // 골드 높은 순 조회
        List<WarriorHero> sortGoldHero = warriorHeroRepository.findAll().stream()
                .sorted(new Comparator<WarriorHero>() {
                    @Override
                    public int compare(WarriorHero o1, WarriorHero o2) {
                        return o2.getGold() - o1.getGold();
                    }
                })
                .toList();
        System.out.println(sortGoldHero);

        // 레벨 10 이상
        List<WarriorHero> sortTenLevelHero = warriorHeroRepository.findAll().stream()
                .filter(h -> h.getLevel() >= 10)
                .toList();
        System.out.println(sortTenLevelHero);

        // 고블린 공격력 높은 순서
        List<Goblin> goblinSortAttackList = goblinMonsterRepository.findAll().stream()
                .sorted(new Comparator<Goblin>() {
                    @Override
                    public int compare(Goblin o1, Goblin o2) {
                        return o2.getAttack() - o1.getAttack();
                    }
                }).toList();


        // 고블린 보상 높은 순서
        List<Goblin> goblinSortGoldList = goblinMonsterRepository.findAll().stream()
                .sorted(new Comparator<Goblin>() {
                    @Override
                    public int compare(Goblin o1, Goblin o2) {
                        return o2.getRewardGold() - o1.getRewardGold();
                    }
                }).toList();

        // 완료된 퀘스트 조회
        List<Quest> questResultList = questRepository.findAll().stream()
                .filter(Quest::isCompleted)
                .toList();

        // 미완료 퀘스트 조회
        List<Quest> questNotResultList = questRepository.findAll().stream()
                .filter(q -> !q.isCompleted())
                .toList();


        System.out.println(warriorHeroRepository.findAll());
        System.out.println(goblinMonsterRepository.findAll());
        System.out.println(questRepository.findAll());

    }

}
