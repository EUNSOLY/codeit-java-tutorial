package com.example.demo;

import com.example.demo.game.HerosGameService;
import com.example.demo.game.OneCoinGameService;
import com.example.demo.game.TwoCoinGameService;
import com.example.demo.game.common.IGameService;
import com.example.demo.hero.*;
import com.example.demo.hero.common.Hero;
import com.example.demo.member.Member;
import com.example.demo.temp.RadioRemoteControl;
import com.example.demo.temp.RemoteControlAbstract;
import com.example.demo.temp.TvRemoteControl;

import java.util.Arrays;
import java.util.List;

//@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {

        StrengthHeroRepository strengthHeroRepository = new StrengthHeroRepository();
        strengthHeroRepository.save(new StrengthHero("Dragon Knight"));
        strengthHeroRepository.save(new StrengthHero("Pudge"));
        strengthHeroRepository.save(new StrengthHero("Slardar"));
        System.out.println(StrengthHeroRepository.repository.size());

        strengthHeroRepository.delete("Pudge");

        System.out.println(StrengthHeroRepository.repository.size());
        System.out.println(StrengthHeroRepository.repository.keySet());

        AgilityHeroRepository agilityRepository = new AgilityHeroRepository();
        agilityRepository.save(new AgilityHero("Weaver"));
        agilityRepository.save(new AgilityHero("Slark"));
        agilityRepository.save(new AgilityHero("Juggernaut"));
        agilityRepository.delete("Weaver");

        IntelligenceHeroRepository intelligenceRepository = new IntelligenceHeroRepository();
        intelligenceRepository.save(new IntelligenceHero("Puck"));
        intelligenceRepository.save(new IntelligenceHero("Crystal Maiden"));
        intelligenceRepository.save(new IntelligenceHero("Zeus"));
        intelligenceRepository.delete("Puck");

//      Hero strength         = strengthHeroRepository.findById("Slardar");
        StrengthHero strength = strengthHeroRepository.findById("Slardar");
//      Hero agility        = agilityRepository.findById("Slark");
        AgilityHero agility = agilityRepository.findById("Slark");
//      Hero intelligence             = intelligenceRepository.findById("Zeus");
        IntelligenceHero intelligence = intelligenceRepository.findById("Zeus");

        System.out.println("- 🟥 힘 속성 영웅");
        strength.getName();     // 인터페이스 다형성(Polymorphism) 상관없이 구체(구현)클래스 내 메서드 호출 가능
        strength.attack();
        strength.ultimate();
        strength.berserk();     // 인터페이스 다형성(Polymorphism) 상관없이 구체(구현)클래스 내 메서드 호출 가능

        System.out.println("- 🟩 민첩 속성 영웅");
        agility.getName();      // 인터페이스 다형성(Polymorphism) 상관없이 구체(구현)클래스 내 메서드 호출 가능
        agility.attack();
        agility.ultimate();

        System.out.println("- 🟦 지능 속성 영웅");
        intelligence.getName(); // 인터페이스 다형성(Polymorphism) 상관없이 구체(구현)클래스 내 메서드 호출 가능
        intelligence.attack();
        intelligence.ultimate();

//        strength.berserk(); // 인터페이스 다형성(Polymorphism) 상관없이 구체(구현)클래스 내 메서드 호출 가능


//        IGameService onwGame = new TwoCoinGameService(new StrengthHero());
//        onwGame.play();
//
//        IGameService game = new HerosGameService(List.of(new StrengthHero(), new AgilityHero(), new IntelligenceHero()));
//        game.play();
//
//        Hero strength = new StrengthHero();
//        Hero agility = new AgilityHero();
//        Hero intelligence = new IntelligenceHero();
//
//        System.out.println("- 🟥 힘 속성 영웅");
//        strength.attack();
//        strength.ultimate();
////      strength.berserk(); // 인터페이스 공통 형상 메서드만 호출 가능 = 인터페이스 다형성(Polymorphism)
//
//        System.out.println("- 🟩 민첩 속성 영웅");
//        agility.attack();
//        agility.ultimate();
//
//        System.out.println("- 🟦 지능 속성 영웅");
//        intelligence.attack();
//        intelligence.ultimate();


//        RemoteControlAbstract tvRemoteControl = new TvRemoteControl("삼성 tv");
//        RemoteControlAbstract radioRemoteControl = new RadioRemoteControl("삼성 radio");
//
//
//        System.out.println(tvRemoteControl.getName());
//
//        tvRemoteControl.rightClick();
//        tvRemoteControl.leftClick();
//        tvRemoteControl.powerOn();
//        tvRemoteControl.powerOff();
//
//        System.out.println(radioRemoteControl.getName());
//        radioRemoteControl.rightClick();
//        radioRemoteControl.leftClick();
//        radioRemoteControl.powerOn();
//        radioRemoteControl.powerOff();


    }
}
