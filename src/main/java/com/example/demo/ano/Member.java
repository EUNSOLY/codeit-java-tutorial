package com.example.demo.ano;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Data
public class Member {
    /* private final */ Integer id;
    /* private final */ String name;
    /* private final */ int age;
    /* private final */ String email;
}