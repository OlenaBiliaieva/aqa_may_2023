package com.hillel.person.optexample;

import com.hillel.person.Person;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = List.of(new Person("Olha", 23),
                new Person("Tania", 28),
                new Person("Olena", 25),
                new Person("Tola", 26),
                new Person("Oleg", 24));

        Optional<Person> person = personList.stream().filter(p -> p.getAge() > 29)
                .findFirst();//null


        Person person1 = person.get();
        Optional.of(person1);
        Optional<Person> pers = person.filter(person2 -> person2.getName().startsWith("O"));
        Optional<String> pers1 = person.map(Person::getName);


        boolean isPresent = person.isPresent();
        pers.ifPresent(System.out::println);

        System.out.printf(String.valueOf(pers));


        Person p12 = pers.orElseGet((Supplier<? extends Person>) new Person("Tania", 28));
        Person p13 = pers.orElse( new Person("Tania", 28));

    }
}
