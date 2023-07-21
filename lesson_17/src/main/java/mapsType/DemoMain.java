package mapsType;

import mapsType.person.Person;

import java.util.*;

public class DemoMain {
    public static void main(String[] args) {
        Map<String, Person> map = new HashMap<>();
        Person person = new Person("Olha", 12);
        Person person1 = new Person("Valentin", 13);
        map.put("1", person);
        map.put("1", person1);
        Set<String> setKeys = map.keySet();
        Collection <Person> collections = map.values();
        System.out.println(map.get("1"));

//        System.out.println(map);
//        System.out.println(map.size());


        Map<Person, String> map1 = new LinkedHashMap<>();
        map1.put(person1, "Valentin");
        // map1.put(person1, "Valentin2");
        map1.put(null, "null");
        map1.put(person, "Olha");
        //  System.out.println(map1);


    }
}
