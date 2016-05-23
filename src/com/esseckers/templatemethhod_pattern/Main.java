package com.esseckers.templatemethhod_pattern;

public class Main {

    public static void main(String[] args) {
        Man dancer = new Dancer();
        dancer.createMan();

        Man spaceman = new Spaceman();
        spaceman.createMan();

        Man builder = new Builder();
        builder.createMan();
    }
}
