package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class OriginalPrice {
    @Getter
    private String name;
    @Getter
    private int price;


    public void display() {
        System.out.printf("상품(%s)의 가격은 %s 입니다.%n", this.name, this.price);
    }
}
