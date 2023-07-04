package com.bosofthegym.core.trainings.abstractions;

import com.bosofthegym.core.trainings.abstractions.core.Instructor;

public abstract class Training implements CalculationCalories {

    private int durationMin;

    private Instructor instructor;

    public Training(int durationMin, Instructor instructor) {
        this.durationMin = durationMin;
        this.instructor = instructor;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public Instructor getInstructor() {
        return instructor;
    }

}
