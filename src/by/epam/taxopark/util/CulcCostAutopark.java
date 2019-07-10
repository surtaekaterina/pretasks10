package by.epam.taxopark.util;

import by.epam.taxopark.entity.Auto;

import java.util.List;


public class CulcCostAutopark {


    public static int culcCost(List<Auto> cars) {

        int sumCost = 0;

        for (Auto car : cars) {
            sumCost += car.getId();
        }
        return sumCost;
    }
}
