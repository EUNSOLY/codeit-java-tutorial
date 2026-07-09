package com.example.demo.hero.common;

public interface HeroRepository<T extends Hero, F> extends HeroCreateRepository<T, F>, HeroReadRepository<T, F>, HeroDeleteRepository<T, F> {
    public static final String EXCEPTION = "have to be implemented : F save(T hero)";

    public static void print() {
        System.out.println(EXCEPTION);
    }

    /* public : abstract 와 default 는 공존할 수 없다. 두개가 합쳐 사용될 수 없다 = default 정의 후 @Override */
    default F save(T hero) {
        print();
        throw new RuntimeException(EXCEPTION);

    }

}

