package com.esseckers.templatemethhod_pattern;

/**
 * Created by Ivan Danilov on 23.05.2016.
 * Email: i.danilov@globus-ltd.com
 */
public class Dancer extends Man {

    @Override
    protected void born() {
        System.out.println("I will be dancer!!!");
    }

    @Override
    protected void lives() {
        System.out.println("I dance like a god!!!");
    }

    @Override
    protected void dies() {
        System.out.println("Overdose of drugs");
    }

    @Override
    protected void printImpression() {
        System.out.println("Finally!!!");
    }
}
