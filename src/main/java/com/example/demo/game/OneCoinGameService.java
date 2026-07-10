package com.example.demo.game;

import com.example.demo.game.common.IGameService;
import com.example.demo.hero.common.Hero;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OneCoinGameService implements IGameService {
    public final Hero hero;

    @Override
    public void play() {
        System.out.println("---- Gram Start ----");

        hero.attack();
        hero.ultimate();

        System.out.println("---- Gram End ----");

    }
}
