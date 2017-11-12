package com.alistar.patterns.strategy.trafficLightProject.nopatterns.objects;

import java.util.ArrayList;
import java.util.List;

public class TrafficLight {
    private List<Signal> signals;

    public TrafficLight() {
        signals = new ArrayList<Signal>();
    }

    public List<Signal> addSignal(Signal signal) {
        this.signals.add(signal);
        return signals;
    }

    public List<Signal> addSignal(List<Signal> signals) {
        this.signals.addAll(signals);
        return signals;
    }

    public void light() {
        for (Signal signal : signals) {
            signal.light();
        }
    }
}
