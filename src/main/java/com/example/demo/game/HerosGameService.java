package com.example.demo.game;


import com.example.demo.game.common.IGameService;
import com.example.demo.hero.common.Hero;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class HerosGameService implements IGameService {
    public final List<Hero> heroes;


    @Override
    public void play() {
//        System.out.println("--- game start ---");
//        for (int i = 0; i < heroes.size(); i++) {
//            heroes.get(i).ultimate();
//            heroes.get(i).attack();
//
//            System.out.println("--- game step " + (i + 1) + "---");
//
//            if (i == heroes.size()) {
//                System.out.println("--- game end ---");
//            }
//        }


    }
}
