package com.bosofthegym.core.trainings.impl;

import com.bosofthegym.core.trainings.abstractions.Training;
import com.bosofthegym.core.trainings.abstractions.core.Instructor;

public class Run extends Training {

    private int speed;

    public Run(int durationMin, Instructor instructor, int speed) {
        super(durationMin, instructor);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public double calculateCaloric(double weight) {
        return (indexCommon(weight) * getDurationMin()) * speed;
    }

    @Override
    public String toString() {
      return "Run{" +
                "durationMin=" + getDurationMin() +
                ", instructor=" + getInstructor().toString() +
                "speed=" + speed +
                '}';
    }
}
