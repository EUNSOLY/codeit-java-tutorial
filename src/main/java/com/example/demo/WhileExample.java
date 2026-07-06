package com.example.demo;

public class WhileExample {
    public static void main(String[] args) {
        int countdown = 5;
        while (countdown > 0){
            System.out.println("countdown = " + countdown--);
        }

        int countdown2 = 5;

        do {
            System.out.println("countdown2 = " + countdown--);
        }while (countdown2 < 5);
    }
}
