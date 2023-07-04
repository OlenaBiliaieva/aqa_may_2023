package com.bosofthegym.core.trainings.impl;

import com.bosofthegym.core.trainings.abstractions.Training;
import com.bosofthegym.core.trainings.abstractions.core.Instructor;

public class Meditation extends Training {

    private int breathInMinute;

    public Meditation(int durationMin, Instructor instructor, int breathInMinute) {
        super(durationMin, instructor);
        this.breathInMinute = breathInMinute;
    }

    public int getBreathInMinute() {
        return breathInMinute;
    }

    @Override
    public double calculateCaloric(double weight) {
        return (indexCommon(weight) * getDurationMin()) / breathInMinute;
    }

    @Override
    public String toString() {
        return "Meditation{" +
                "durationMin=" + getDurationMin() +
                ", instructor=" + getInstructor().toString() +
                "breathInMinute=" + breathInMinute +
                '}';
    }
}
