package com.example.demo.game;

import com.example.demo.Player;
import com.example.demo.Side;
import com.example.demo.hero.AgilityHero;
import com.example.demo.hero.StrengthHero;
import lombok.*;

import java.time.LocalDate;
import java.util.*;


@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class Game {
    private final LocalDate playdate;
    private final Integer playtime;
    private final Side winning;
    private final Map<Integer, Player> players;

    public static final List<Game> HISTORY = new ArrayList<>() {
        {
            // 1번째 게임
            add(new Game(
                    LocalDate.of(2026, 1, 5),
                    34,
                    Side.RADIANT,
                    new HashMap<>() {
                        {
                            put(1, new Player(1, "Aaron", Side.RADIANT, 12, 3, 8, new StrengthHero("Axe")));
                            put(2, new Player(2, "Caron", Side.RADIANT, 8, 4, 10, new AgilityHero("Luna")));
                            put(3, new Player(3, "Earon", Side.RADIANT, 5, 2, 15, new StrengthHero("Mars")));
                            put(4, new Player(4, "Garon", Side.RADIANT, 14, 1, 5, new AgilityHero("Sniper")));
                            put(5, new Player(5, "Iaron", Side.RADIANT, 4, 5, 12, new StrengthHero("Pudge")));

                            put(6, new Player(6, "Baron", Side.DIRE, 3, 9, 4, new AgilityHero("Viper")));
                            put(7, new Player(7, "Daron", Side.DIRE, 5, 8, 2, new StrengthHero("Sven")));
                            put(8, new Player(8, "Faron", Side.DIRE, 2, 10, 5, new AgilityHero("Slark")));
                            put(9, new Player(9, "Haron", Side.DIRE, 1, 7, 8, new StrengthHero("Tidehunter")));
                            put(10, new Player(10, "Jaron", Side.DIRE, 4, 9, 3, new AgilityHero("Ursa")));
                        }
                    }
            ));

            // 2번째 게임
            add(new Game(
                    LocalDate.of(2026, 1, 8),
                    28,
                    Side.DIRE,
                    new HashMap<>() {
                        {
                            put(1, new Player(1, "Baron", Side.RADIANT, 2, 8, 4, new StrengthHero("Doom")));
                            put(2, new Player(2, "Daron", Side.RADIANT, 4, 9, 2, new AgilityHero("Riki")));
                            put(3, new Player(3, "Faron", Side.RADIANT, 1, 7, 5, new StrengthHero("Kunkka")));
                            put(4, new Player(4, "Haron", Side.RADIANT, 5, 10, 3, new AgilityHero("Razor")));
                            put(5, new Player(5, "Jaron", Side.RADIANT, 3, 6, 4, new StrengthHero("Lycan")));

                            put(6, new Player(6, "Aaron", Side.DIRE, 10, 2, 8, new AgilityHero("Juggernaut")));
                            put(7, new Player(7, "Caron", Side.DIRE, 4, 3, 15, new StrengthHero("Magnus")));
                            put(8, new Player(8, "Earon", Side.DIRE, 9, 4, 12, new AgilityHero("Mirana")));
                            put(9, new Player(9, "Garon", Side.DIRE, 3, 2, 18, new StrengthHero("Centaur Warrunner")));
                            put(10, new Player(10, "Iaron", Side.DIRE, 14, 4, 5, new AgilityHero("Morphling")));
                        }
                    }
            ));

            // 3번째 게임
            add(new Game(
                    LocalDate.of(2026, 1, 12),
                    45,
                    Side.RADIANT,
                    new HashMap<>() {
                        {
                            put(1, new Player(1, "Haron", Side.RADIANT, 15, 4, 10, new StrengthHero("Lifestealer")));
                            put(2, new Player(2, "Jaron", Side.RADIANT, 3, 5, 20, new AgilityHero("Vengeful Spirit")));
                            put(3, new Player(3, "Aaron", Side.RADIANT, 11, 6, 14, new StrengthHero("Wraith King")));
                            put(4, new Player(4, "Caron", Side.RADIANT, 9, 3, 8, new AgilityHero("Faceless Void")));
                            put(5, new Player(5, "Earon", Side.RADIANT, 6, 4, 18, new StrengthHero("Tusk")));

                            put(6, new Player(6, "Garon", Side.DIRE, 7, 10, 5, new AgilityHero("Terrorblade")));
                            put(7, new Player(7, "Iaron", Side.DIRE, 4, 8, 12, new StrengthHero("Bristleback")));
                            put(8, new Player(8, "Baron", Side.DIRE, 6, 9, 4, new AgilityHero("Ember Spirit")));
                            put(9, new Player(9, "Daron", Side.DIRE, 3, 11, 7, new StrengthHero("Legion Commander")));
                            put(10, new Player(10, "Faron", Side.DIRE, 2, 6, 9, new AgilityHero("Bloodseeker")));
                        }
                    }
            ));

            // 4번째 게임
            add(new Game(
                    LocalDate.of(2026, 1, 17),
                    31,
                    Side.DIRE,
                    new HashMap<>() {
                        {
                            put(1, new Player(1, "Iaron", Side.RADIANT, 4, 9, 3, new AgilityHero("Phantom Assassin")));
                            put(2, new Player(2, "Earon", Side.RADIANT, 2, 7, 6, new StrengthHero("Night Stalker")));
                            put(3, new Player(3, "Daron", Side.RADIANT, 5, 11, 4, new AgilityHero("Troll Warlord")));
                            put(4, new Player(4, "Baron", Side.RADIANT, 1, 8, 9, new StrengthHero("Omniknight")));
                            put(5, new Player(5, "Haron", Side.RADIANT, 6, 10, 2, new AgilityHero("Sniper")));

                            put(6, new Player(6, "Jaron", Side.DIRE, 11, 2, 10, new StrengthHero("Chaos Knight")));
                            put(7, new Player(7, "Faron", Side.DIRE, 8, 4, 14, new AgilityHero("Bounty Hunter")));
                            put(8, new Player(8, "Caron", Side.DIRE, 4, 3, 22, new StrengthHero("Earthshaker")));
                            put(9, new Player(9, "Aaron", Side.DIRE, 15, 5, 7, new AgilityHero("Shadow Fiend")));
                            put(10, new Player(10, "Garon", Side.DIRE, 7, 4, 16, new StrengthHero("Dawnbreaker")));
                        }
                    }
            ));

            // 5번째 게임
            add(new Game(
                    LocalDate.of(2026, 1, 21),
                    38,
                    Side.RADIANT,
                    new HashMap<>() {
                        {
                            put(1, new Player(1, "Jaron", Side.RADIANT, 14, 3, 6, new AgilityHero("Templar Assassin")));
                            put(2, new Player(2, "Aaron", Side.RADIANT, 18, 5, 9, new StrengthHero("Alchemist")));
                            put(3, new Player(3, "Daron", Side.RADIANT, 4, 6, 21, new StrengthHero("Slardar")));
                            put(4, new Player(4, "Faron", Side.RADIANT, 8, 2, 15, new AgilityHero("Nyx Assassin")));
                            put(5, new Player(5, "Haron", Side.RADIANT, 7, 4, 12, new StrengthHero("Dragon Knight")));

                            put(6, new Player(6, "Iaron", Side.DIRE, 6, 10, 4, new AgilityHero("Anti-Mage")));
                            put(7, new Player(7, "Garon", Side.DIRE, 3, 12, 9, new StrengthHero("Earth Spirit")));
                            put(8, new Player(8, "Earon", Side.DIRE, 9, 7, 5, new AgilityHero("Spectre")));
                            put(9, new Player(9, "Caron", Side.DIRE, 1, 8, 11, new StrengthHero("Underlord")));
                            put(10, new Player(10, "Baron", Side.DIRE, 4, 14, 2, new AgilityHero("Meepo")));
                        }
                    }
            ));

            // 6번째 게임
            add(new Game(
                    LocalDate.of(2026, 1, 26),
                    24,
                    Side.DIRE,
                    new HashMap<>() {
                        {
                            put(1, new Player(1, "Garon", Side.RADIANT, 2, 9, 1, new AgilityHero("Broodmother")));
                            put(2, new Player(2, "Caron", Side.RADIANT, 0, 8, 4, new StrengthHero("Treant Protector")));
                            put(3, new Player(3, "Iaron", Side.RADIANT, 4, 10, 3, new AgilityHero("Monkey King")));
                            put(4, new Player(4, "Aaron", Side.RADIANT, 1, 7, 5, new StrengthHero("Primal Beast")));
                            put(5, new Player(5, "Baron", Side.RADIANT, 3, 9, 2, new AgilityHero("Clinkz")));

                            put(6, new Player(6, "Haron", Side.DIRE, 12, 1, 8, new AgilityHero("Phantom Lancer")));
                            put(7, new Player(7, "Earon", Side.DIRE, 6, 3, 15, new StrengthHero("Tiny")));
                            put(8, new Player(8, "Jaron", Side.DIRE, 14, 2, 5, new AgilityHero("Medusa")));
                            put(9, new Player(9, "Daron", Side.DIRE, 8, 1, 20, new StrengthHero("Spirit Breaker")));
                            put(10, new Player(10, "Faron", Side.DIRE, 9, 3, 10, new AgilityHero("Gyrocopter")));
                        }
                    }
            ));

            // 7번째 게임
            add(new Game(
                    LocalDate.of(2026, 1, 30),
                    42,
                    Side.RADIANT,
                    new HashMap<>() {
                        {
                            put(1, new Player(1, "Faron", Side.RADIANT, 11, 5, 9, new AgilityHero("Lone Druid")));
                            put(2, new Player(2, "Baron", Side.RADIANT, 13, 7, 6, new StrengthHero("Huskar")));
                            put(3, new Player(3, "Haron", Side.RADIANT, 4, 6, 18, new AgilityHero("Venomancer")));
                            put(4, new Player(4, "Garon", Side.RADIANT, 6, 4, 22, new StrengthHero("Centaur Warrunner")));
                            put(5, new Player(5, "Daron", Side.RADIANT, 15, 5, 11, new AgilityHero("Luna")));

                            put(6, new Player(6, "Earon", Side.DIRE, 9, 11, 4, new StrengthHero("Wraith King")));
                            put(7, new Player(7, "Aaron", Side.DIRE, 7, 9, 6, new AgilityHero("Slark")));
                            put(8, new Player(8, "Iaron", Side.DIRE, 4, 12, 8, new StrengthHero("Tidehunter")));
                            put(9, new Player(9, "Jaron", Side.DIRE, 3, 8, 10, new AgilityHero("Viper")));
                            put(10, new Player(10, "Caron", Side.DIRE, 5, 9, 7, new StrengthHero("Doom")));
                        }
                    }
            ));

            // 8번째 게임
            add(new Game(
                    LocalDate.of(2026, 2, 4),
                    36,
                    Side.DIRE,
                    new HashMap<>() {
                        {
                            put(1, new Player(1, "Earon", Side.RADIANT, 8, 12, 5, new AgilityHero("Ursa")));
                            put(2, new Player(2, "Daron", Side.RADIANT, 3, 9, 10, new StrengthHero("Pudge")));
                            put(3, new Player(3, "Caron", Side.RADIANT, 6, 8, 4, new AgilityHero("Weaver")));
                            put(4, new Player(4, "Baron", Side.RADIANT, 2, 11, 9, new StrengthHero("Magnus")));
                            put(5, new Player(5, "Aaron", Side.RADIANT, 7, 10, 6, new AgilityHero("Juggernaut")));

                            put(6, new Player(6, "Jaron", Side.DIRE, 16, 4, 8, new StrengthHero("Lifestealer")));
                            put(7, new Player(7, "Iaron", Side.DIRE, 12, 6, 11, new AgilityHero("Riki")));
                            put(8, new Player(8, "Haron", Side.DIRE, 4, 5, 22, new StrengthHero("Kunkka")));
                            put(9, new Player(9, "Garon", Side.DIRE, 10, 3, 14, new AgilityHero("Razor")));
                            put(10, new Player(10, "Faron", Side.DIRE, 8, 8, 19, new StrengthHero("Mars")));
                        }
                    }
            ));

            // 9번째 게임
            add(new Game(
                    LocalDate.of(2026, 2, 9),
                    29,
                    Side.RADIANT,
                    new HashMap<>() {
                        {
                            put(1, new Player(1, "Aaron", Side.RADIANT, 11, 2, 5, new AgilityHero("Drow Ranger")));
                            put(2, new Player(2, "Iaron", Side.RADIANT, 4, 3, 18, new StrengthHero("Earthshaker")));
                            put(3, new Player(3, "Faron", Side.RADIANT, 9, 1, 7, new AgilityHero("Morphling")));
                            put(4, new Player(4, "Earon", Side.RADIANT, 8, 4, 12, new StrengthHero("Axe")));
                            put(5, new Player(5, "Caron", Side.RADIANT, 13, 2, 6, new AgilityHero("Sniper")));

                            put(6, new Player(6, "Jaron", Side.DIRE, 3, 9, 2, new StrengthHero("Sven")));
                            put(7, new Player(7, "Haron", Side.DIRE, 2, 10, 5, new AgilityHero("Faceless Void")));
                            put(8, new Player(8, "Garon", Side.DIRE, 4, 8, 4, new StrengthHero("Legion Commander")));
                            put(9, new Player(9, "Daron", Side.DIRE, 1, 7, 6, new AgilityHero("Bloodseeker")));
                            put(10, new Player(10, "Baron", Side.DIRE, 2, 11, 3, new StrengthHero("Bristleback")));
                        }
                    }
            ));

            // 10번째 게임
            add(new Game(
                    LocalDate.of(2026, 2, 14),
                    39,
                    Side.DIRE,
                    new HashMap<>() {
                        {
                            put(1, new Player(1, "Baron", Side.RADIANT, 7, 11, 4, new AgilityHero("Terrorblade")));
                            put(2, new Player(2, "Jaron", Side.RADIANT, 2, 9, 12, new StrengthHero("Tusk")));
                            put(3, new Player(3, "Haron", Side.RADIANT, 3, 8, 15, new AgilityHero("Vengeful Spirit")));
                            put(4, new Player(4, "Earon", Side.RADIANT, 5, 12, 6, new StrengthHero("Lycan")));
                            put(5, new Player(5, "Faron", Side.RADIANT, 6, 10, 8, new AgilityHero("Ember Spirit")));

                            put(6, new Player(6, "Aaron", Side.DIRE, 14, 5, 11, new StrengthHero("Chaos Knight")));
                            put(7, new Player(7, "Caron", Side.DIRE, 18, 3, 7, new AgilityHero("Phantom Assassin")));
                            put(8, new Player(8, "Daron", Side.DIRE, 9, 6, 16, new StrengthHero("Night Stalker")));
                            put(9, new Player(9, "Garon", Side.DIRE, 12, 4, 9, new AgilityHero("Troll Warlord")));
                            put(10, new Player(10, "Iaron", Side.DIRE, 5, 5, 24, new StrengthHero("Dawnbreaker")));
                        }
                    }
            ));

            // 11번째 게임
            add(new Game(
                    LocalDate.of(2026, 2, 19),
                    33,
                    Side.RADIANT,
                    new HashMap<>() {
                        {
                            put(1, new Player(1, "Caron", Side.RADIANT, 15, 3, 7, new AgilityHero("Templar Assassin")));
                            put(2, new Player(2, "Garon", Side.RADIANT, 10, 4, 12, new StrengthHero("Alchemist")));
                            put(3, new Player(3, "Aaron", Side.RADIANT, 5, 6, 18, new StrengthHero("Slardar")));
                            put(4, new Player(4, "Haron", Side.RADIANT, 8, 2, 14, new AgilityHero("Bounty Hunter")));
                            put(5, new Player(5, "Daron", Side.RADIANT, 6, 5, 19, new StrengthHero("Dragon Knight")));

                            put(6, new Player(6, "Earon", Side.DIRE, 4, 10, 3, new AgilityHero("Anti-Mage")));
                            put(7, new Player(7, "Iaron", Side.DIRE, 2, 12, 8, new StrengthHero("Earth Spirit")));
                            put(8, new Player(8, "Baron", Side.DIRE, 7, 8, 4, new AgilityHero("Spectre")));
                            put(9, new Player(9, "Jaron", Side.DIRE, 3, 9, 5, new StrengthHero("Underlord")));
                            put(10, new Player(10, "Faron", Side.DIRE, 2, 5, 9, new AgilityHero("Meepo")));
                        }
                    }
            ));

            // 12번째 게임
            add(new Game(
                    LocalDate.of(2026, 2, 25),
                    27,
                    Side.DIRE,
                    new HashMap<>() {
                        {
                            put(1, new Player(1, "Daron", Side.RADIANT, 3, 10, 2, new AgilityHero("Broodmother")));
                            put(2, new Player(2, "Iaron", Side.RADIANT, 1, 8, 5, new StrengthHero("Treant Protector")));
                            put(3, new Player(3, "Jaron", Side.RADIANT, 6, 9, 3, new AgilityHero("Monkey King")));
                            put(4, new Player(4, "Aaron", Side.RADIANT, 2, 7, 4, new StrengthHero("Primal Beast")));
                            put(5, new Player(5, "Baron", Side.RADIANT, 4, 8, 6, new AgilityHero("Clinkz")));

                            put(6, new Player(6, "Caron", Side.DIRE, 13, 2, 7, new AgilityHero("Phantom Lancer")));
                            put(7, new Player(7, "Earon", Side.DIRE, 5, 4, 18, new StrengthHero("Tiny")));
                            put(8, new Player(8, "Faron", Side.DIRE, 16, 3, 5, new AgilityHero("Medusa")));
                            put(9, new Player(9, "Garon", Side.DIRE, 7, 2, 21, new StrengthHero("Spirit Breaker")));
                            put(10, new Player(10, "Haron", Side.DIRE, 9, 5, 12, new AgilityHero("Gyrocopter")));
                        }
                    }
            ));
        }
    };
}