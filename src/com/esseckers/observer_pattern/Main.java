package com.esseckers.observer_pattern;

public class Main {

    public static void main(String[] args) {
        UserData weatherData = new UserData();

        UserDisplay currentDisplay = new UserDisplay(weatherData);
        weatherData.setMeasurements("Jhon", "Travolta", "travolta@mail.com");
        weatherData.setMeasurements("Nik", "Cage", "cage@mail.com");
        weatherData.setMeasurements("Kim", "Besingeyl", "kim@mail.com");
    }
}
