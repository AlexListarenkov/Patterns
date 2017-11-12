package com.alistar.patterns.strategy.trafficLightProject.strategy.behavior;

public class IntermittentLightBehavior implements LightBehavior {
    @Override
    public void light(int time) {
        System.out.println("Прерывистый сигнал");
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
