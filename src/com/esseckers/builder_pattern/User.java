package com.esseckers.builder_pattern;

/**
 * Created by Fake on 20.04.2016.
 */
public class User {

    private final long id;
    private final String firstName;
    private final String secondName;
    private final String email;
    private final String phone;
    private final String gender;
    private final String job;

    public static class Builder {
        // Required parameters
        private final String firstName;
        private final String secondName;
        private final String email;

        // Optional parameters - initialize with default values
        private long id = 0l;
        private String phone = "";
        private String gender = "";
        private String job = "";

        public Builder(String firstName, String secondName, String email) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.email = email;
        }

        public Builder userId(long id) {
            this.id = id;
            return this;
        }

        public Builder userPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder userGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder userJob(String job) {
            this.job = job;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    private User(Builder builder) {
        // Required parameters
        firstName = builder.firstName;
        secondName = builder.secondName;
        email = builder.email;

        // Optional parameters
        id = builder.id;
        phone = builder.phone;
        gender = builder.gender;
        job = builder.job;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
