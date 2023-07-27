package com.hillel.person.demo;

import com.hillel.person.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainPerson {
    public static void main(String[] args) {
        List<Person> personList = List.of(new Person("Olha", 23),
                new Person("Tania", 28),
                new Person("Olena", 25),
                new Person("Tola", 26),
                new Person("Oleg", 24));

        personList.forEach(p -> System.out.println(p));

        personList.stream()
                .filter(person -> person.getAge() > 24)
                .filter(person -> person.getName().startsWith("T"))
                .forEach(person -> System.out.println(person));

        List<String> names = personList
                .stream()
                .map(p -> p.getName())
                .collect(Collectors.toList());

        List<Person> people =  personList.stream()
                .filter(person -> person.getAge() > 24)
                .filter(person -> person.getName().startsWith("T"))
                .collect(Collectors.toList());

        Stream<Person> personStream = personList.stream()
                .filter(person -> person.getAge() > 24)
                .filter(person -> person.getName().startsWith("T"));

        List<Person> p = personList.stream()
                .filter(person -> person.getAge() > 24)
                .filter(person -> person.getName().startsWith("T"))
                .collect(Collectors.toList());

        boolean p1 = personList.stream()
                .anyMatch(person -> isMatch(person));
        System.out.println(p1);

        boolean p2 = personList.stream()
                .allMatch(person -> isMatch(person));


        System.out.println(p2);
    }

    public static boolean isMatch(Person person){
        return person.getAge() > 20 && person.getAge() < 29;
    }
}
