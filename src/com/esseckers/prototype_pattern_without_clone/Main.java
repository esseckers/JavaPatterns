package com.esseckers.prototype_pattern_without_clone;

public class Main {

    public static void main(String[] args) {
        User prototype = new User();
        prototype.setGrowth("180");
        prototype.setName("Jack Esseckers");
        prototype.setEmail("fake@gmail.com");
        prototype.setAge("26");
        prototype.setJob("java developer");
        prototype.setBd("always now");

        System.out.println(prototype.toString());

        User clone = prototype.copy();

        clone.setName("Tom Cruz");
        clone.setJob("actor");
        clone.setGrowth("156");

        System.out.println(clone.toString());
    }
}
