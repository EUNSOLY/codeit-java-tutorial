package com.sprint.mission.hero;

import com.sprint.mission.hero.entity.WarriorHero;

public class DemoApplication {
    public static void main(String[] args) {
        WarriorHero warriorHero = new WarriorHero("Aaron", 10000);
        System.out.println("-----");
        System.out.println(warriorHero);
        warriorHero.changeUpdateAt();
        System.out.println(warriorHero);

    }

}
