package com.alistar.patterns.strategy.trafficLightProject.nopatterns.objects;

public class Signal {
    private String color;
    private int time;

    public Signal() {
    }

    public Signal(String color, int time) {
        this.color = color;
        this.time = time;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void light() {
        for (int i = 0; i < time; i++) {
            System.out.println(color + " signal is lighting");
        }
    }
}
