package com.esseckers.decorator_pattern;

public class Main {

    public static void main(String[] args) {
        Job developer = new Developer();

        Job workingDeveloper = new WorkingJobDecorator(new Developer());

        Job testerQI
    }
}
