package com.example.demo;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DeliveryService {
    private final OrderRepository orderRepository;

    public void departed(Integer orderId) {
        Order order = orderRepository.read(orderId);
        order.departed();
        System.out.println("-- DeliveryService::departed - 배송 출발" + order);

    }

    public void arrived(Integer orderId) {
        Order order = orderRepository.read(orderId);
        order.arrived();
        System.out.println("-- DeliveryService::arrived - 배송 도착" + order);
    }
}
