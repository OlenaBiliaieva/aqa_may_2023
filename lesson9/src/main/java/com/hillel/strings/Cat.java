package com.hillel.strings;

public class Cat {

    int age;
    String name;

    public Cat(int age) {
        this.age = age;
    }

    public String printCat(){
        return "age "+age + "name " + name;
    }
}
