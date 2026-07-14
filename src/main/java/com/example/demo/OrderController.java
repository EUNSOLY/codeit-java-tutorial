package com.example.demo;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    private final PaymentService paymentService;
    private final DeliveryService deliveryService;

    public void process() {
        // (1) 구매 페이지 : 구매 정보 <- 선택한 상품
        String product = "MacBook Pro";
        Order order = orderService.create(product);
        Integer orderId = order.getId();

        // (2) 결제 페이지 : 결제 정보 <- 구매 정보
        PaymentMethod method = PaymentMethod.CASH;
        paymentService.payment(orderId, method);

        // (3) 배송 : 구매 정보 내부에 있는 배송 정보가 계속 수정됨
        deliveryService.departed(orderId);
        deliveryService.arrived(orderId);
    }

}
