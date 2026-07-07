package com.example.demo.ano;

import com.example.demo.dto.MemberCreateRequestDto;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Objects;


//@Getter
//@Setter
//@ToString(onlyExplicitlyIncluded = true, includeFieldNames = false)
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
//@AllArgsConstructor(access = AccessLevel.PUBLIC)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Member {
    /* private */ Integer id;
    /* private */ String name;
    /* private */ int age;
    /* private */ String email;
}