package com.example.demo.ramen;

public class JinRamen extends Ramen {
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
