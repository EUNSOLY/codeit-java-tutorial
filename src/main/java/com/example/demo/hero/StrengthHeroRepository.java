package com.example.demo.hero;

import com.example.demo.hero.common.HeroRepository;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Getter
@RequiredArgsConstructor
public class StrengthHeroRepository implements HeroRepository<StrengthHero, String> {

    public static Map<String, StrengthHero> repository = new HashMap<>();


    @Override
    public StrengthHero findById(String name) {
        return repository.get(name);
    }

    
    @Override
    public String save(StrengthHero hero) {
        repository.put(hero.getName(), hero);
        return hero.getName();
    }

    @Override
    public void delete(String name) {
        repository.remove(name);

    }

    public void berserk() {
        System.out.println("각성");
    }
}
