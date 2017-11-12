package com.alistar.patterns.strategy.trafficLightProject.strategy.objects;

import com.alistar.patterns.strategy.trafficLightProject.strategy.behavior.ConstantLightBehavior;

public class YellowSignal extends Signal {

    public YellowSignal(int time) {
        lightBehavior = new ConstantLightBehavior();
        color = Signals.YELLOW;
        this.time = time;
    }
}
