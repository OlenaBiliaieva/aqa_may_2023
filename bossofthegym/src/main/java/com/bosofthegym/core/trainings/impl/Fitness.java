package com.bosofthegym.core.trainings.impl;

import com.bosofthegym.core.trainings.abstractions.Training;
import com.bosofthegym.core.trainings.abstractions.core.Instructor;
import com.bosofthegym.core.trainings.enums.Level;

public class Fitness extends Training {

    private int repetitions;

    public Fitness(int durationMin, Instructor instructor, Level level,  int repetitions) {
        super(durationMin, instructor, level);
        this.repetitions = repetitions;
    }

    public int getRepetitions() {
        return repetitions;
    }

    @Override
    public double calculateCaloric(double weight) {
        return (indexCommon(weight) * getDurationMin() * repetitions) * getLevel().getCaloryCoef();
    }

    @Override
    public String toString() {
        return "Fitness{" +
                "repetitions=" + repetitions +
                "level= " + getLevel() +
                '}';
    }
}
