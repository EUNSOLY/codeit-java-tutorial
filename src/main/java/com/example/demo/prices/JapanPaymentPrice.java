package com.example.demo.prices;


// 상속 = 기능의 확장
// @생성자에 관련된 어노테이션은 사용하지못한다 - 상속받았기 때문에 부모 클래스의 생성자를 함께 작성해야해서
public class JapanPaymentPrice extends OriginalPrice {
    private final static double TAX_RATE = 1.5; // 상품가격에 붙는 세금(%) = 부가가치세 10%
    private int deliveryPrice;

    public JapanPaymentPrice(String name, int price, int deliveryPrice) {
        super(name, price);
    }

    @Override
    public void display() {
        System.out.printf("일본에서 구매하는 상품(%s)의 가격은 %s 입니다.%n", super.name, (int) (super.price * TAX_RATE + this.deliveryPrice));
    }


}
