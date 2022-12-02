package carListing;

import java.util.List;

public class Sorting {

    public static void printCarBySorting(List<Car> carList, String color){
        System.out.println("Sort by = \"" + color + "\"");
        for(Car c: carList){
            if (c.getColor().equals(color))
                c.printCar();
        }
    }
    public static void printCarBySorting(List<Car> carList, int low, int high){
        System.out.println("Sort by = \"" + low + "\" ,  \"" + high + "\"");
        for (Car c: carList){
            if (c.getPrice() >= low && c.getPrice() <= high)
                c.printCar();
        }
    }
    public static void sortByModel(List<Car> carList, String model){
        System.out.println("Sort by = \"" + model + "\"");
        for (Car c: carList){
            if (c.getModel().equals(model))
                c.printCar();
        }
    }
    public static void sortByName(List<Car> carList, String name){
        System.out.println("Sort by = \"" + name + "\"");
        for (Car c: carList){
            if (c.getName().equals(name))
                c.printCar();
        }
    }
}
