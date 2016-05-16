package com.esseckers.memento_pattern;

import java.util.Observer;

public class Main {

    public static void main(String[] args) {
        Initiator originator = new Initiator();
        Keeper caretaker = new Keeper();

        originator.setState("alive");
        System.out.printf("State is %s\n", originator.getState());
        caretaker.setMemento(originator.saveState());

        originator.setState("lost");
        System.out.printf("State is %s\n", originator.getState());

        originator.restoreState(caretaker.getMemento());
        System.out.printf("State is %s\n", originator.getState());
    }
}
