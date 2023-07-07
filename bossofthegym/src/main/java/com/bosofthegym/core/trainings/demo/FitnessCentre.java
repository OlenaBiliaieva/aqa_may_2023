package com.bosofthegym.core.trainings.demo;

import com.bosofthegym.core.trainings.abstractions.User;
import com.bosofthegym.core.trainings.abstractions.core.Instructor;
import com.bosofthegym.core.trainings.enums.Level;
import com.bosofthegym.core.trainings.impl.Fitness;
import com.bosofthegym.core.trainings.impl.Meditation;
import com.bosofthegym.core.trainings.impl.Run;

public class FitnessCentre {
    public static void main(String[] args) {
        User user1 = new User(1, 68);
        Instructor instructor = new Instructor("Max", 2);
        Meditation meditation = new Meditation(10, instructor, Level.HARD, 45);
        user1.train(meditation);
        System.out.println(user1);
        Run run = new Run(20, instructor, Level.HARD, 11);
        user1.train(run);
        System.out.println(user1);
        Fitness fitness = new Fitness(40, instructor, Level.INTERMEDIATE, 30);
        user1.train(fitness);
        System.out.println(user1);
    }
}
