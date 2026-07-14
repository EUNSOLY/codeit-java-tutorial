package com.example.demo;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum PaymentMethod {
    CARD("카드 결제", 0.00),
    CASH("현금 결제", 0.02),
    BANK("계좌 이체", 0.01);

    String method;
    Double discount;


}
