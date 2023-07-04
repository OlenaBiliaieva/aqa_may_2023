package com.bosofthegym.core.trainings.abstractions;

import com.bosofthegym.core.trainings.impl.Meditation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class User {
    private int id;
    private List<CalculationCalories> trainings;

    private double summCalories;

    private double weight;

    private int index;

    public User(int id, double weight) {
        this.id = id;
        this.weight = weight;
        this.trainings = new LinkedList<>();
        this.summCalories = 0;
        index = 0;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void train(CalculationCalories training) {
        summCalories += summCalories + training.calculateCaloric(weight);
        trainings.add(training);
        index++;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", trainings=" + trainings
                + "\n" +
                ", summCalories=" + summCalories +
                ", weight=" + weight +
                ", index=" + index +
                '}';
    }
}
