package com.bosofthegym.core.trainings.impl;

import com.bosofthegym.core.trainings.abstractions.Training;
import com.bosofthegym.core.trainings.abstractions.core.Instructor;

public class Fitness extends Training {

    private int repetitions;

    public Fitness(int durationMin, Instructor instructor, int repetitions) {
        super(durationMin, instructor);
        this.repetitions = repetitions;
    }

    public int getRepetitions() {
        return repetitions;
    }

    @Override
    public double calculateCaloric(double weight) {
        return indexCommon(weight) * getDurationMin() * repetitions;
    }

}
