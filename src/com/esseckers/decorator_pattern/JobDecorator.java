package com.esseckers.decorator_pattern;

/**
 * Created by Fake on 20.04.2016.
 */
public class JobDecorator implements Job {

    protected Job decoratedJob;

    public JobDecorator(Job decoratedJob) {
        this.decoratedJob = decoratedJob;
    }

    @Override
    public void perform() {
        decoratedJob.perform();
    }
}
