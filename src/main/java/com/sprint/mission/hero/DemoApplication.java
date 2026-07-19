package com.sprint.mission.hero;


import com.sprint.mission.hero.entity.hero.ArcherHero;
import com.sprint.mission.hero.entity.hero.MageHero;
import com.sprint.mission.hero.entity.hero.WarriorHero;
import com.sprint.mission.hero.entity.monster.Dragon;
import com.sprint.mission.hero.entity.monster.Goblin;
import com.sprint.mission.hero.entity.quest.Quest;
import com.sprint.mission.hero.repository.*;

public class DemoApplication {
    public static void main(String[] args) {

        // WarriorHero
        WarriorHero heroAaron = new WarriorHero("Aaron", 10000, 1000);
        WarriorHero heroLeon = new WarriorHero("Leon", 8500, 950);

        // MageHero
        MageHero heroMerlin = new MageHero("Merlin", 6500, 1800);
        MageHero heroLuna = new MageHero("Luna", 7000, 1700);

        // ArcherHero
        ArcherHero heroRobin = new ArcherHero("Robin", 7500, 1400);
        ArcherHero heroSylvia = new ArcherHero("Sylvia", 7200, 1500);

        WarriorHeroRepository warriorHeroRepository = new WarriorHeroRepository();
        MageHeroRepository mageHeroRepository = new MageHeroRepository();
        ArcherHeroRepository archerHeroRepository = new ArcherHeroRepository();

        // Repo 저장
        warriorHeroRepository.create(heroAaron);
        warriorHeroRepository.create(heroLeon);

        mageHeroRepository.create(heroMerlin);
        mageHeroRepository.create(heroLuna);

        archerHeroRepository.create(heroRobin);
        archerHeroRepository.create(heroSylvia);

        // Monster
        Goblin goblinKing = new Goblin("Goblin King");
        Goblin goblinWarrior = new Goblin("Goblin Warrior");
        Goblin goblinShaman = new Goblin("Goblin Shaman");

        Dragon redDragon = new Dragon("Red Dragon");
        Dragon blackDragon = new Dragon("Black Dragon");
        Dragon ancientDragon = new Dragon("Ancient Dragon");

        MonsterRepository<Goblin> goblinMonsterRepository = new MonsterRepository<>();
        MonsterRepository<Dragon> dragonMonsterRepository = new MonsterRepository<>();

        // 몬스터 저장
        goblinMonsterRepository.create(goblinKing);
        goblinMonsterRepository.create(goblinWarrior);
        goblinMonsterRepository.create(goblinShaman);

        dragonMonsterRepository.create(redDragon);
        dragonMonsterRepository.create(blackDragon);
        dragonMonsterRepository.create(ancientDragon);

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

        QuestRepository<Quest> questRepository = new QuestRepository<>();
        questRepository.create(goblinHuntQuest);
        questRepository.create(villageDefenseQuest);
        questRepository.create(dragonSlayerQuest);

    }

}
