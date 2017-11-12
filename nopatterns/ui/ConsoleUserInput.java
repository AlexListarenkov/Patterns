package com.alistar.patterns.strategy.trafficLightProject.nopatterns.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConsoleUserInput implements UI {
    Scanner scanner;

    public ConsoleUserInput() {
        scanner = new Scanner(System.in);
    }

    @Override
    public Map<String, Integer> getUserInput() {
        String color;
        Integer time;
        System.out.println("Input color");
        color = scanner.nextLine();
        System.out.println("Input time");
        time = scanner.nextInt();
        Map<String, Integer> userInput = new HashMap<String, Integer>();
        userInput.put(color, time);
        return userInput;
    }
}
