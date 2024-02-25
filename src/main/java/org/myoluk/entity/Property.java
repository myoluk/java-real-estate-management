package org.myoluk.entity;

import org.myoluk.enums.PropertyType;

public class Property {
    private PropertyType type;
    private int rooms;
    private int livingRooms;
    private double squareMeters;
    private double price;

    public Property(PropertyType type, int rooms, int livingRooms, double squareMeters, double price) {
        this.type = type;
        this.rooms = rooms;
        this.livingRooms = livingRooms;
        this.squareMeters = squareMeters;
        this.price = price;
    }

    public PropertyType getType() {
        return type;
    }

    public void setType(PropertyType type) {
        this.type = type;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getLivingRooms() {
        return livingRooms;
    }

    public void setLivingRooms(int livingRooms) {
        this.livingRooms = livingRooms;
    }

    public double getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(double squareMeters) {
        this.squareMeters = squareMeters;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
