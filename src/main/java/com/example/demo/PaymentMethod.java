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


    public static PaymentMethod from(String method) {
        for (PaymentMethod m : PaymentMethod.values()) {
            if (m.name().equals(method)) {
                return m;
            }
        }
        throw new RuntimeException("지정한 결제 종류가 맞지않습니다." + method);
    }
}
