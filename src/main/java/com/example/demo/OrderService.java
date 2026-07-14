package com.example.demo;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public Order create(String product) {
        Order order = orderRepository.create(product);
        System.out.println("-- 주문이 접수 되었습니다." + order);
        return order;
    }

}
