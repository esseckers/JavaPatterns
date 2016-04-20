package com.esseckers.factory_pattern;

public class Main {

    public static void main(String[] args) {
        ColorFactory factory = new ColorFactory();

        Color red = factory.getColor("red");
        red.print();

        Color blue = factory.getColor("blue");
        blue.print();

        Color black = factory.getColor("black");
        black.print();
    }
}
