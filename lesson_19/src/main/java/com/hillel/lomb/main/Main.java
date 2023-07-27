package com.hillel.lomb.main;

import com.hillel.lomb.pers.Person;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Person pers = new Person("Natasha", 24, List.of());
        Person pers1 = new Person();
        pers1.getAge();
    }
}
