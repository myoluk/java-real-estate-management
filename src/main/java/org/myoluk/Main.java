package org.myoluk;

import org.myoluk.entity.House;
import org.myoluk.entity.Property;
import org.myoluk.enums.PropertyType;
import org.myoluk.service.PropertyService;
import org.myoluk.utils.RandomPropertyCreator;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        PropertyService propertyService = new PropertyService();

        int numberOfProperty = 100;
        propertyService.addAll(RandomPropertyCreator.create(numberOfProperty));

        System.out.println("Total price of Houses: " +
                propertyService.totalPriceByType(PropertyType.HOUSE));
        System.out.println("Total price of Villas: " +
                propertyService.totalPriceByType(PropertyType.VILLA));
        System.out.println("Total price of Summerhouses: " +
                propertyService.totalPriceByType(PropertyType.SUMMERHOUSE));
        System.out.println("Total price of all types of properties: " +
                propertyService.totalPriceOfAllTypes());

        System.out.println("Average square meters of Houses: " +
                propertyService.averageSquareMetersByType(PropertyType.HOUSE));
        System.out.println("Average square meters of Villas: " +
                propertyService.averageSquareMetersByType(PropertyType.VILLA));
        System.out.println("Average square meters of Summerhouses: " +
                propertyService.averageSquareMetersByType(PropertyType.SUMMERHOUSE));
        System.out.println("Average square meters of all types of properties: " +
                propertyService.averageSquareMetersOfAllTypes());

        List<Property> filteredPropertyList = propertyService.filterByRoomsAndLivingRooms(3,1);
        System.out.println("Filtered properties based on rooms and living rooms: " +
                propertyService.filterByRoomsAndLivingRooms(3,1).size() +
                " properties found.\n");
    }
}