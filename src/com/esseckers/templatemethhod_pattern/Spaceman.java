package com.esseckers.templatemethhod_pattern;

/**
 * Created by Ivan Danilov on 23.05.2016.
 * Email: i.danilov@globus-ltd.com
 */
public class Spaceman extends Man {
    @Override
    protected void born() {
        System.out.println("I will be spaceman!!!");
    }

    @Override
    protected void lives() {
        System.out.println("I fly in space");
    }

    @Override
    protected void dies() {
        System.out.println("Spaceship is crashed");
    }

    @Override
    protected void printImpression() {
        System.out.println("Please, give me another chance!!!");
    }
}
