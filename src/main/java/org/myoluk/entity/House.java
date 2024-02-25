package org.myoluk.entity;

import org.myoluk.enums.PropertyType;

public class House extends Property{
    public House(int rooms, int livingRooms, double squareMeters, double price) {
        super(PropertyType.HOUSE, rooms, livingRooms, squareMeters, price);
    }
}
