package com.bosofthegym.core.trainings.abstractions;

public interface CalculationCalories {

    double calculateCaloric(double weight);

    default double indexCommon(double weight) {
        return (weight / 200) * 11.5 * 3.5;
    }
}
