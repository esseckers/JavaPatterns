package com.esseckers.decorator_pattern;

/**
 * Created by Fake on 20.04.2016.
 */
public class WorkingJobDecorator extends JobDecorator {
    public WorkingJobDecorator(Job decoratedJob) {
        super(decoratedJob);
    }

    @Override
    public void perform() {
        decoratedJob.perform();
        System.out.println("working");
    }
}
