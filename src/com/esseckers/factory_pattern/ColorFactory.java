package com.esseckers.factory_pattern;

/**
 * Created by Fake on 20.04.2016.
 */
public class ColorFactory {

    public Color getColor(String colorName) {
        if (colorName == null) {
            return null;
        } else if (colorName.equalsIgnoreCase("red")) {
            return new Red();
        } else if (colorName.equalsIgnoreCase("blue")) {
            return new Blue();
        } else if (colorName.equalsIgnoreCase("black")) {
            return new Black();
        }
        return null;
    }
}
