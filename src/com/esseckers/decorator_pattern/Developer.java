package com.esseckers.decorator_pattern;

/**
 * Created by Fake on 20.04.2016.
 */
public class Developer implements Job {
    @Override
    public void perform() {
        System.out.println("Job: developer");
    }
}
