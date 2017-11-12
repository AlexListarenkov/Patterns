package com.alistar.patterns.strategy.trafficLightProject.strategy;

import com.alistar.patterns.strategy.trafficLightProject.strategy.objects.GreenSignal;
import com.alistar.patterns.strategy.trafficLightProject.strategy.objects.RedSignal;
import com.alistar.patterns.strategy.trafficLightProject.strategy.objects.Signal;
import com.alistar.patterns.strategy.trafficLightProject.strategy.objects.YellowSignal;
import com.alistar.patterns.strategy.trafficLightProject.strategy.ui.ConsoleUserInput;
import com.alistar.patterns.strategy.trafficLightProject.strategy.ui.UI;

import java.util.ArrayList;
import java.util.List;

public class TrafficLightSimulator {
    private UI userInput;

    public static void main(String[] args) {
        TrafficLightSimulator simulator = new TrafficLightSimulator();
        simulator.go();
    }

    private void go() {
        initUI();

        List<Signal> signals = new ArrayList<Signal>();
        signals.add(new RedSignal(userInput.getUserInput()));
        signals.add(new YellowSignal(userInput.getUserInput()));
        signals.add(new GreenSignal(userInput.getUserInput()));

        for (Signal signal : signals) {
            signal.describe();
            signal.showLight();
        }
    }

    private void initUI() {
        userInput = new ConsoleUserInput();
    }
}
