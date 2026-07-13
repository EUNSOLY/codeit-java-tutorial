package com.example.demo.ramen;

// 행위 패턴 : 템플릿 메서드 패턴
// 
public class SinRamen extends Ramen {
    @Override
    protected String water() {
        return "에비앙";
    }

    @Override
    protected String soup() {
        return "신라면";
    }

    @Override
    protected String noodle() {
        return "건면";
    }
}
