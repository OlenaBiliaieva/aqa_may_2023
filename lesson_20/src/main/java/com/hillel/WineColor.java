package com.hillel;

public enum WineColor {

    RED("red"),
    WHITE("white"),
    GREEN("green"),
    ROSE("rose");

    String color;


    WineColor(String color) {
        this.color = color;
    }
}
