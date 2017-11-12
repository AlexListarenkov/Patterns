package com.alistar.patterns.strategy.trafficLightProject.strategy.objects;

import com.alistar.patterns.strategy.trafficLightProject.strategy.behavior.IntermittentLightBehavior;
import com.alistar.patterns.strategy.trafficLightProject.strategy.behavior.LightBehavior;

public abstract class Signal {
    LightBehavior lightBehavior;
    Signals color;
    int time;

    public void setLightBehavior(LightBehavior lightBehavior) {
        this.lightBehavior = lightBehavior;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void showLight() {
        lightBehavior.light((int) time / 70 * 100);
        lightBehavior = new IntermittentLightBehavior();
        lightBehavior.light((int) time / 30 * 100);
    }

    public void describe() {
        System.out.println(color);
        System.out.println("Время: " + time);
    }
}
