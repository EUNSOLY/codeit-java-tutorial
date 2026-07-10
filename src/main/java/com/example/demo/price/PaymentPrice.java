package com.example.demo.price;


// @생성자에 관련된 어노테이션은 사용하지못한다 - 상속받았기 때문에 부모 클래스의 생성자를 함께 작성해야해서
public class PaymentPrice extends OriginalPrice {
    // [값이 변하지않을 상수라 final 그리고 객체마다 생성할 필요없어서 static]
    private final static double TAX_RATE = 1.1; // 상품가격에 붙는 세금(%) = 부가가치세 10%
    private int deliveryPrice;

    public PaymentPrice(String name, int price, int deliveryPrice) {
        super(name, price);
    }

    @Override
    public void display() {
        System.out.printf("상품(%s)의 가격은 %s 입니다.%n", super.name, (int) (super.price * TAX_RATE + this.deliveryPrice));
    }


}
