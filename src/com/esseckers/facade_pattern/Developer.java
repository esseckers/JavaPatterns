package com.esseckers.facade_pattern;

/**
 * Created by Ivan Danilov on 23.05.2016.
 * Email: i.danilov@globus-ltd.com
 */
public class Developer {

    public boolean develop(boolean isTrivialTask) {
        System.out.println("Developer start perform the task");
        return isTrivialTask;
    }
}
