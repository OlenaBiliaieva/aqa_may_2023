package com.bosofthegym.core.trainings.demo;

import com.bosofthegym.core.trainings.abstractions.User;
import com.bosofthegym.core.trainings.abstractions.core.Instructor;
import com.bosofthegym.core.trainings.impl.Meditation;
import com.bosofthegym.core.trainings.impl.Run;

public class FitnessCentre {
    public static void main(String[] args) {
        User user1 = new User(1, 68);
        Instructor instructor = new Instructor("Max",2);
        Meditation meditation = new Meditation(10, instructor, 45);
        user1.train(meditation);
        Run run = new Run(20,instructor,11);
        user1.train(run);
        System.out.println(user1);
        System.out.println(user1);

    }
}
