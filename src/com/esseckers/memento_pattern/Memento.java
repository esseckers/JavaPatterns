package com.esseckers.memento_pattern;

/**
 * Created by Ivan Danilov on 16.05.2016.
 * Email: i.danilov@globus-ltd.com
 */
public class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
