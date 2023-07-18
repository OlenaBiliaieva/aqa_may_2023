package com.hellel.lesson16.example.set;

import com.hellel.lesson16.realization.Person;

import java.util.HashSet;
import java.util.Set;

public class MainHashSet {
    public static void main(String[] args) {
//        Set<String> set1 = new HashSet<>();
//        set1.add("Hello");
//        set1.add("Hello");
//        set1.add("Hello");
//        System.out.println(set1);

        Set<Person> people = new HashSet<>();

        people.add(new Person("Daria", 23));
        people.add(new Person("Olha", 23));
        people.add(new Person("Olha", 23));
        people.add(new Person("Daria", 23));

        Person p1 = new Person("Olha", 23);
        Person p2 = new Person("Olha", 23);
        System.out.println(p1.equals(p2));
        System.out.println(people);
        System.out.println(getPersonByName("Olha", people));
        System.out.println(people.contains(p1));

    }

    public static Person getPersonByName(String name, Set<Person> people) {
        for (Person p : people) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }
}
