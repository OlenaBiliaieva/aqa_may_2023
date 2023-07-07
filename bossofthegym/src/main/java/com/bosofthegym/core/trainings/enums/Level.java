package com.bosofthegym.core.trainings.enums;

public enum Level {

    EASY(1.3),
    INTERMEDIATE(1.5),
    HARD(1.9);

    private double caloryCoef;

    Level(double caloryCoef) {
        this.caloryCoef = caloryCoef;
    }

    public double getCaloryCoef() {
        return caloryCoef;
    }
}
