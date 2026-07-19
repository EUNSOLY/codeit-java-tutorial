package com.sprint.mission.hero;


import com.sprint.mission.hero.entity.hero.ArcherHero;
import com.sprint.mission.hero.entity.hero.MageHero;
import com.sprint.mission.hero.entity.hero.WarriorHero;
import com.sprint.mission.hero.entity.monster.Dragon;
import com.sprint.mission.hero.entity.monster.Goblin;
import com.sprint.mission.hero.repository.HeroRepository;
import com.sprint.mission.hero.repository.MonsterRepository;

public class DemoApplication {
    public static void main(String[] args) {
        MageHero arron = new MageHero("Aaron");
        ArcherHero baron = new ArcherHero("Baron");
        WarriorHero caron = new WarriorHero("Caron");

        HeroRepository heroRepository = new HeroRepository();
        heroRepository.save(arron);
        heroRepository.save(baron);
        heroRepository.save(caron);

        // 몬스터
        Dragon radDragon = new Dragon("RedDragon");
        Dragon blueDragon = new Dragon("BlueDragon");
        Goblin redGoblin = new Goblin("RedGoblin");
        Goblin blueGoblin = new Goblin("BlueGoblin");
        MonsterRepository monsterRepository = new MonsterRepository();
        monsterRepository.save(radDragon);
        monsterRepository.save(blueDragon);
        monsterRepository.save(redGoblin);
        monsterRepository.save(blueGoblin);


    }
}
