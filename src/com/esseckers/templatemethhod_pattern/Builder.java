package com.esseckers.templatemethhod_pattern;

/**
 * Created by Ivan Danilov on 23.05.2016.
 * Email: i.danilov@globus-ltd.com
 */
public class Builder extends Man {
    @Override
    protected void born() {
        System.out.println("I will be builder!!!");
    }

    @Override
    protected void lives() {
        System.out.println("I build a skyscraper");
    }

    @Override
    protected void dies() {
        System.out.println("Accidents at construction site");
    }

    @Override
    protected void printImpression() {
        System.out.println("It was wonderful life");
    }
}
