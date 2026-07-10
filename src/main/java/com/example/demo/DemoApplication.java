package com.example.demo;

//@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {

        String name = "하리보 젤리";
        int price = 2500;
        int deliveryPrice = 2500;
        PaymentPrice paymentPrice = new PaymentPrice(name, price, deliveryPrice);
        paymentPrice.display();
    }
}
