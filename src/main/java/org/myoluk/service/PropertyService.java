package org.myoluk.service;

import org.myoluk.entity.Property;
import org.myoluk.enums.PropertyType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PropertyService {
    private final List<Property> _propertyList = new ArrayList<>();

    public void add(Property property) {
        _propertyList.add(property);
    }

    public void addAll(List<Property> propertyList) {
        _propertyList.addAll(propertyList);
    }

    public double totalPriceByType(PropertyType type) {
        return _propertyList.stream()
                .filter(property -> property.getType() == type)
                .mapToDouble(Property::getPrice)
                .sum();
    }

    public double totalPriceOfAllTypes() {
        return _propertyList.stream()
                .mapToDouble(Property::getPrice)
                .sum();
    }

    public double averageSquareMetersByType(PropertyType type) {
        return _propertyList.stream()
                .filter(property -> property.getType() == type)
                .mapToDouble(Property::getSquareMeters)
                .average()
                .orElse(0);
    }

    public double averageSquareMetersOfAllTypes() {
        return _propertyList.stream()
                .mapToDouble(Property::getSquareMeters)
                .average()
                .orElse(0);
    }

    public List<Property> filterByRoomsAndLivingRooms(int rooms, int livingRooms) {
        return _propertyList.stream()
                .filter(property -> property.getRooms() == rooms)
                .filter(property -> property.getLivingRooms() == livingRooms)
                .collect(Collectors.toList());
    }

}
