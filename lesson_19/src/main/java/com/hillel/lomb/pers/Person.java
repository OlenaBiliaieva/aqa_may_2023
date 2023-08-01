package com.hillel.lomb.pers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
public class Person {
    private String name;
    private int age;
    List<String> product;


}
