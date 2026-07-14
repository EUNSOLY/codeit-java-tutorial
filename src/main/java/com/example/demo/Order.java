package com.example.demo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
public class Order {
    @Getter
    private final Integer id = 1;
    private final String product;
    private PaymentMethod measure;
    private OrderStatus status = OrderStatus.PENDING_PAYMENT;

    public void pay(PaymentMethod measure) {
        this.measure = measure;
        this.status = OrderStatus.COMPLETE_PAYMENT;
    }

    public void departed() {
        this.status = OrderStatus.DELIVERY_DEPARTED;
    }

    public void arrived() {
        this.status = OrderStatus.DELIVERY_ARRIVED;

    }

}
