package com.esseckers.memento_pattern;

/**
 * Created by Ivan Danilov on 16.05.2016.
 * Email: i.danilov@globus-ltd.com
 */
public class Initiator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveState() {
        return new Memento(state);
    }

    public void restoreState(Memento memento) {
        this.state = memento.getState();
    }
}
