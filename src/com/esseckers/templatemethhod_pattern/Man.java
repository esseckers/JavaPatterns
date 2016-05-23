package com.esseckers.templatemethhod_pattern;

/**
 * Created by Ivan Danilov on 23.05.2016.
 * Email: i.danilov@globus-ltd.com
 */
public abstract class Man {

    protected abstract void born();

    protected abstract void lives();

    protected abstract void dies();

    protected abstract void printImpression();

    public void createMan() {
        born();
        lives();
        dies();
        printImpression();
    }
}
