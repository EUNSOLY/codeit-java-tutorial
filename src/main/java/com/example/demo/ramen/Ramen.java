package com.example.demo.ramen;

public abstract class Ramen {

    public final void boiling() {
        System.out.println("---------------------");
        System.out.println("라면을 끓인다.");
        System.out.println("물은 넣는다 : " + this.water());
        System.out.println("스프를 넣는다 : " + this.soup());
        System.out.println("면을 넣는다 : " + this.noodle());
        System.out.println("완성");
        System.out.println("---------------------");
    }


    protected abstract String water();

    protected abstract String soup();

    protected abstract String noodle();
}
