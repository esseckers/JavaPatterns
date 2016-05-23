package com.esseckers.facade_pattern;

/**
 * Created by Ivan Danilov on 23.05.2016.
 * Email: i.danilov@globus-ltd.com
 */
public class Project {

    private Developer developer;
    private TeamLead teamLead;
    private Tester tester;
    private Manager manager;

    public Project() {
        this.developer = new Developer();
        this.teamLead = new TeamLead();
        this.tester = new Tester();
        this.manager = new Manager();
    }

    public void createProduct() {
        if (!developer.develop(false)) {
            teamLead.help();
        }
        tester.testingTask();
        manager.deliverToCustomer();
    }
}
