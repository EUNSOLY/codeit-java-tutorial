package com.example.demo;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum OrderStatus {
    PENDING_PAYMENT("결제 대기", true),
    COMPLETE_PAYMENT("결제 완료", true),
    DELIVERY_DEPARTED("배송 시작", false),
    DELIVERY_ARRIVED("배송 완료", false);

    String status;
    boolean cancellable;
}
