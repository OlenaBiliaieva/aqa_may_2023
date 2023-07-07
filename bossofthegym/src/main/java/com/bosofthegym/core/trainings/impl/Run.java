package com.bosofthegym.core.trainings.impl;

import com.bosofthegym.core.trainings.abstractions.Training;
import com.bosofthegym.core.trainings.abstractions.core.Instructor;
import com.bosofthegym.core.trainings.enums.Level;

public class Run extends Training {

    private int speed;

    public Run(int durationMin, Instructor instructor, Level level, int speed) {
        super(durationMin, instructor, level);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public double calculateCaloric(double weight) {
        return ((indexCommon(weight) * getDurationMin()) * speed)
                * getLevel().getCaloryCoef();
    }

    @Override
    public String toString() {
        return "Run{" +
                "durationMin= " + getDurationMin() +
                ", instructor= " + getInstructor().toString() +
                "speed= " + speed +
                "level= " +getLevel() +
                '}';
    }
}
