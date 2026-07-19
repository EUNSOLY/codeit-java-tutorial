package com.sprint.mission.hero;

import com.sprint.mission.hero.common.HeroRepository;
import com.sprint.mission.hero.entity.hero.WarriorHero;
import com.sprint.mission.hero.entity.monster.Goblin;
import com.sprint.mission.hero.entity.quest.GoblinHuntQuest;
import com.sprint.mission.hero.repository.WarriorHeroRepository;

public class DemoApplication {
    public static void main(String[] args) {
        WarriorHero heroAaron = new WarriorHero("Aaron", 10000, 1000);
//        WarriorHero heroBaron = new WarriorHero("Baron", 10000, 1000);
//        WarriorHero heroCaron = new WarriorHero("Caron", 10000, 1000);
//        WarriorHero heroDaron = new WarriorHero("Daron", 10000, 1000);
//        HeroRepository<WarriorHero> warriorHeroHeroRepository = new WarriorHeroRepository();
//        warriorHeroHeroRepository.create(heroAaron);
//        warriorHeroHeroRepository.create(heroBaron);
//        warriorHeroHeroRepository.create(heroCaron);
//        warriorHeroHeroRepository.create(heroDaron);
//
//        warriorHeroHeroRepository.findAll().forEach(System.out::println);
//        WarriorHero aaron = warriorHeroHeroRepository.find("Aaron");
//        aaron.changeName("Aaron2");
//        warriorHeroHeroRepository.update(aaron.getId(), aaron);
//        warriorHeroHeroRepository.delete("Caron");
//        System.out.println("------- 최종 -------");
//        warriorHeroHeroRepository.findAll().forEach(System.out::println);

        Goblin goblin = new Goblin("고블린 마왕");
        GoblinHuntQuest goblinHuntQuest = new GoblinHuntQuest("고블린을 처치하라!", "고블린과 헌터의 싸움이 시작된다.", heroAaron.getId(), goblin.getId());

        System.out.println(goblinHuntQuest);

    }

}
