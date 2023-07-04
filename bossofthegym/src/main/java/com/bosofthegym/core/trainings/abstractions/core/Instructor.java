package com.bosofthegym.core.trainings.abstractions.core;

public class Instructor {
    private String name;
    private int level;

    public Instructor(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
