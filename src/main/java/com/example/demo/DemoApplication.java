package com.example.demo;

import com.example.demo.hero.AgilityHero;
import com.example.demo.hero.IntelligenceHero;
import com.example.demo.hero.StrengthHero;
import com.example.demo.member.Member;

import java.util.Arrays;

//@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        StrengthHero strength = new StrengthHero();
        AgilityHero agility = new AgilityHero();
        IntelligenceHero intelligence = new IntelligenceHero();

        System.out.println("- 🟥 힘 속성 영웅");
        strength.attack();
        strength.ultimate();

        System.out.println("- 🟩 민첩 속성 영웅");
        agility.attack();
        agility.ultimate();

        System.out.println("- 🟦 지능 속성 영웅");
        intelligence.attack();
        intelligence.ultimate();


    }
}
