package org.myoluk.utils;

import org.myoluk.entity.House;
import org.myoluk.entity.Property;
import org.myoluk.enums.PropertyType;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomPropertyCreator {
    private static final Random random = new Random();

    public static Property create() {
        PropertyType type = PropertyType.values()[random.nextInt(PropertyType.values().length)];
        int rooms = random.nextInt(10) + 1;
        int livingRooms = random.nextInt(5) + 1;
        double squareMeters = (random.nextDouble() * 20 + 10) * (rooms + livingRooms);
        double price = (random.nextDouble() * 10000 + 1000) * (rooms + livingRooms);
        return new Property(type, rooms, livingRooms, squareMeters, price);
    }

    public static List<Property> create(int numberOfSamples) {
        List<Property> propertyList = new ArrayList<>();
        for (int i = 0; i < numberOfSamples; i++) {
            propertyList.add(create());
        }
        return propertyList;
    }


}
