package com.example.demo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum Side {
    RADIANT("블루팀 - 래디언트 진영"),
    DIRE("레드팀 - 다이어 진영");

    String description;
}
