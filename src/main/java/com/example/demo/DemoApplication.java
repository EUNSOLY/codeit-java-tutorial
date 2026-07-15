package com.example.demo;

import com.example.demo.game.Game;
import com.example.demo.hero.common.Hero;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<>(Game.HISTORY.getFirst().getPlayers().values());

        System.out.println(" -- Stream.forEach -- ");
        Stream<Player> playerStream = playerList.stream();
//        Stream<String> intermediate = playerStream
//        List<Hero> intermediate = playerStream
//        Set<Hero> intermediate = playerStream
//        Map<String, Hero> intermediate = playerStream
        String intermediate = playerStream
                .filter(player -> player.getSide().equals(Side.RADIANT))
                .filter(player -> player.getKill() >= 5)
                .map(Player::getPickedHero)
                .map(Hero::getName)
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.compareTo(o2);
                    }
                })
//                .sorted(new Comparator<Hero>() {
//                    @Override
//                    public int compare(Hero o1, Hero o2) {
//                        return o1.getName().compareTo(o2.getName());
//                    }
//                })
//                .map(Hero::getName)
                .reduce("래디언트에서 5킬 이상을 달성한 영웅들은 : ",
                        (accumulated, heroName) -> {
                            return accumulated + ", " + heroName;
                        });

//                .collect(Collectors.toMap(
//                        (hero -> hero.getName()),
//                        (hero -> hero)
//                ));
//                .collect(Collectors.toSet())
//                .map(Hero::getName)
//                .forEach(System.out::println);
//                .collect(Collectors.toList());

        System.out.println(intermediate);
    }

}
