package com.esseckers.prototype_pattern_without_clone;

/**
 * Created by Ivan Danilov on 23.05.2016.
 * Email: i.danilov@globus-ltd.com
 */
public class User implements Copyable {

    private String name;
    private String email;
    private String bd;
    private String gender;
    private String age;
    private String growth;
    private String job;

    @Override
    public User copy() {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setBd(bd);
        user.setGender(gender);
        user.setGrowth(growth);
        user.setJob(job);
        user.setAge(age);
        return user;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setGrowth(String growth) {
        this.growth = growth;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", bd='" + bd + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", growth='" + growth + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
