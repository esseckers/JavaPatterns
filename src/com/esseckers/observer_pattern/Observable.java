package com.esseckers.observer_pattern;

/**
 * Created by Ivan Danilov on 16.05.2016.
 * Email: i.danilov@globus-ltd.com
 */
public interface Observable {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
