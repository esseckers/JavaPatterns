package com.esseckers.observer_pattern;

/**
 * Created by Ivan Danilov on 16.05.2016.
 * Email: i.danilov@globus-ltd.com
 */
public class UserDisplay implements Observer {

    private String firstName;
    private String lastName;
    private String email;

    private UserData userData;

    public UserDisplay(UserData userData) {
        this.userData = userData;
        userData.registerObserver(this);
    }

    @Override
    public void notify(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        display();
    }

    public void display() {
        System.out.printf("User info: %s,  %s, %s\n", firstName, lastName, email);
    }
}
