package com.esseckers.observer_pattern;

/**
 * Created by Ivan Danilov on 16.05.2016.
 * Email: i.danilov@globus-ltd.com
 */
public interface Observer {
    void notify(String firstName, String lastName, String email);
}
