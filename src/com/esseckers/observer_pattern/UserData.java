package com.esseckers.observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan Danilov on 16.05.2016.
 * Email: i.danilov@globus-ltd.com
 */
public class UserData implements Observable {

    private List<Observer> observers;
    private String firstName;
    private String lastName;
    private String email;

    public UserData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers)
        {
            observer.notify(firstName, lastName, email);
        }
    }

    public void setMeasurements(String firstName, String lastName, String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        notifyObservers();
    }
}
