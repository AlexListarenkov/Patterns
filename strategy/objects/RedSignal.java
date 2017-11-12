package com.alistar.patterns.strategy.trafficLightProject.strategy.objects;

import com.alistar.patterns.strategy.trafficLightProject.strategy.behavior.ConstantLightBehavior;

public class RedSignal extends Signal {

    public RedSignal(int time) {
        lightBehavior = new ConstantLightBehavior();
        color = Signals.RED;
        this.time = time;
    }
}
