package org.myoluk.entity;

import org.myoluk.enums.PropertyType;

public class Villa extends Property {
    public Villa(int rooms, int livingRooms, double squareMeters, double price) {
        super(PropertyType.VILLA, rooms, livingRooms, squareMeters, price);
    }
}
