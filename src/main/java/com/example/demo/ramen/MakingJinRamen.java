package com.example.demo.ramen;

public class MakingJinRamen extends MakingRamen {
    @Override
    protected String water() {
        return "수돗물";
    }

    @Override
    protected String soup() {
        return "진라면";
    }

    @Override
    protected String noodle() {
        return "얇은면";
    }
}
