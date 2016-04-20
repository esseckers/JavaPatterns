package com.esseckers.builder_pattern;

public class Main {

    public static void main(String[] args) {
	User user = new User.Builder("Fake", "Esseckers", "esseckers.fake@email.com")
            .userId(12312l)
            .userPhone("+7 978 147 25 78")
            .userGender("male")
            .userJob("Java developer")
            .build();

        System.out.print(user.toString());
    }
}
