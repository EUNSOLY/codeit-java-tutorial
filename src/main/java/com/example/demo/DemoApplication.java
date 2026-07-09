package com.example.demo;

import com.example.demo.game.HerosGameService;
import com.example.demo.game.OneCoinGameService;
import com.example.demo.game.TwoCoinGameService;
import com.example.demo.game.common.IGameService;
import com.example.demo.hero.AgilityHero;
import com.example.demo.hero.IntelligenceHero;
import com.example.demo.hero.StrengthHero;
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


        RemoteControlAbstract tvRemoteControl = new TvRemoteControl("삼성 tv");
        RemoteControlAbstract radioRemoteControl = new RadioRemoteControl("삼성 radio");


        System.out.println(tvRemoteControl.getName());
        
        tvRemoteControl.rightClick();
        tvRemoteControl.leftClick();

        System.out.println(radioRemoteControl.getName());
        radioRemoteControl.rightClick();
        radioRemoteControl.leftClick();


    }
}
