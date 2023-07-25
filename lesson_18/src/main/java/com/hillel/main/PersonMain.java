package com.hillel.main;

import com.hillel.person.Person;
import com.hillel.person.comparators.CompareByAge;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> personList = List.of(new Person("Olha", 23),
                new Person("Tania", 28),
                new Person("Oleg", 24));

        Comparator<Person> comparator1 = new CompareByAge();
        Collections.sort(personList, comparator1);

//       Comparator<Person> comparator = Comparator.comparing(p -> p.getAge());

        Collections.sort(personList, Comparator.comparing(Person::getName));
    }
}
