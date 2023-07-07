package com.bosofthegym.core.trainings.abstractions;

import com.bosofthegym.core.trainings.abstractions.core.Instructor;
import com.bosofthegym.core.trainings.enums.Level;

public abstract class Training implements CalculationCalories {

    private int durationMin;

    private Instructor instructor;

    private Level level;

    public Training(int durationMin, Instructor instructor, Level level) {
        this.durationMin = durationMin;
        this.instructor = instructor;
        this.level = level;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public Level getLevel() {
        return level;
    }
}
