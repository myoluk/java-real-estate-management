package org.myoluk.entity;

import org.myoluk.enums.PropertyType;

public class Summerhouse extends Property{
    public Summerhouse(int rooms, int livingRooms, double squareMeters, double price) {
        super(PropertyType.SUMMERHOUSE, rooms, livingRooms, squareMeters, price);
    }
}
