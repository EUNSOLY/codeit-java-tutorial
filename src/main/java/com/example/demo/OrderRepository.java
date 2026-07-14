package com.example.demo;


import java.util.HashMap;
import java.util.Map;

public class OrderRepository {
    private static final Map<Integer, Order> ORDER = new HashMap<>();

    // 생성
    public Order create(String product) {
        Order newOrder = new Order(product);
        ORDER.put(newOrder.getId(), newOrder);
        return newOrder;
    }

    // 업데이트
    public Order update(Order order) {
        if (!ORDER.containsKey(order.getId())) {
            throw new RuntimeException("업데이트하려고하는 주문 정보가 없습니다." + order);
        }
        ORDER.replace(order.getId(), order);
        return order;
    }

    // 읽기
    public Order read(Integer orderId) {
        if (!ORDER.containsKey(orderId)) {
            throw new RuntimeException("찾으시는 정보가 없습니다.");
        }

        return ORDER.get(orderId);
    }
}
