package com.example.demo.prices;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OriginalPrice {
    protected String name;
    protected int price;


    public void display() {
        System.out.printf("상품(%s)의 가격은 %s 입니다.%n", this.name, this.price);
    }
}
