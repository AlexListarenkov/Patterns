package com.alistar.patterns.strategy.trafficLightProject.strategy.behavior;

public class ConstantLightBehavior implements LightBehavior {
    @Override
    public void light(int time) {
        System.out.println("Постоянный свет");
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
