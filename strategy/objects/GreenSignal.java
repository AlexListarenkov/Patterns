package com.alistar.patterns.strategy.trafficLightProject.strategy.objects;

import com.alistar.patterns.strategy.trafficLightProject.strategy.behavior.ConstantLightBehavior;

public class GreenSignal extends Signal{

    public GreenSignal(int time){
        lightBehavior = new ConstantLightBehavior();
        color = Signals.GREEN;
        this.time = time;
    }
}
