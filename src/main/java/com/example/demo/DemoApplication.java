package com.example.demo;

import com.example.demo.hero.AgilityHero;
import com.example.demo.hero.StrengthHero;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;


//@SpringBootApplication
public class DemoApplication {
    private static final Map<Integer, Player> PLAYER = new HashMap<>() {{
        // Radiant 래디언트 진영
        put(1, new Player(1, "Aaron", Side.RADIANT, 7, 12, 2, new AgilityHero("Slark")));
        put(2, new Player(2, "Baron", Side.RADIANT, 2, 1, 6, new StrengthHero("Slardar")));
        put(3, new Player(3, "Caron", Side.RADIANT, 4, 4, 4, new AgilityHero("Weaver")));
        put(4, new Player(4, "Daron", Side.RADIANT, 8, 4, 4, new StrengthHero("Huskar")));
        put(5, new Player(5, "Earon", Side.RADIANT, 1, 4, 4, new AgilityHero("Anti-Mage")));

        // Dire 다이어 진영
        put(6, new Player(6, "Faron", Side.DIRE, 0, 5, 9, new StrengthHero("Tiny")));
        put(7, new Player(7, "Garon", Side.DIRE, 7, 4, 2, new StrengthHero("Dragon Knight")));
        put(8, new Player(8, "Haron", Side.DIRE, 4, 3, 1, new StrengthHero("Night Stalker")));
        put(9, new Player(9, "Iaron", Side.DIRE, 8, 2, 2, new AgilityHero("Phantom Lancer")));
        put(10, new Player(10, "Jaron", Side.DIRE, 1, 8, 7, new AgilityHero("Drow Ranger")));

    }};

    public static void main(String[] args) {
        List<Player> players = new ArrayList<>(PLAYER.values());
        Stream<Player> playerStream = players.stream();
//        System.out.println(" -- Stream.forEach -- ");
//        playerStream.forEach((player) -> System.out.println(player));
        Stream<Player> streamFilter = playerStream.filter(new Predicate<Player>() {
            @Override
            public boolean test(Player player) {
                System.out.println("첫번째 조건을 실행합니다.");
                return player.getSide().equals(Side.RADIANT);
            }
        }).filter(new Predicate<Player>() {
            @Override
            public boolean test(Player player) {
                System.out.println("두번째 조건을 실행합니다.");
                return player.getKill() >= 5;
            }
        });
        System.out.println("필터가 완료되고, 실행시킵니다.");
        streamFilter.forEach(new Consumer<Player>() {
            @Override
            public void accept(Player player) {
                System.out.println(player.toString());
            }
        });
    }

}
