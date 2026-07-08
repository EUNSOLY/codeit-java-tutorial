package com.example.demo.game;

import com.example.demo.game.common.IGameService;
import com.example.demo.hero.common.Hero;

public class TwoCoinGameService implements IGameService {
    public final Hero hero;
    
    public TwoCoinGameService(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void play() {
        System.out.println("---- Gram Start ----");

        hero.attack();
        hero.ultimate();

        System.out.println("---- Gram step ----");

        hero.attack();
        hero.ultimate();

        System.out.println("---- Gram End ----");
    }
}
