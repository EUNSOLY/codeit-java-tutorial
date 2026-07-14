package com.example.demo;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PaymentService {
    private final OrderRepository orderRepository;

    public Order payment(Integer orderId, String method) {
        Order order = orderRepository.read(orderId);
        order.pay(method);
        System.out.println("-- PaymentService::payment - 결제 정보 : " + order);
        return order;
    }
}
