package com.esseckers.decorator_pattern;

public class Main {

    public static void main(String[] args) {
        Job developer = new Developer();

        Job workingDeveloper = new WorkingJobDecorator(new Developer());

        Job workingQI = new WorkingJobDecorator(new QI());

        System.out.println("\nJob concrete");
        developer.perform();

        System.out.println("\nWhat does developer");
        workingDeveloper.perform();

        System.out.println("\nWhat does QI");
        workingQI.perform();
    }
}
