package carListing;

/**
 * To use this Class create a list of car which accepts this parameters and properties
 * FOR DEMO USAGE SAVE THIS CAR LIST IN YOUR MAIN CLASS AS DECLARATION OF CARS LIST AS ARRAY
 *List<Car> cars = Arrays.asList(
 *                 new Car("Honda", "Accord", "Red", 22300),
 *                 new Car("Honda", "Civic", "Blue", 17700),
 *                 new Car("Toyota", "Land Cruiser", "White", 48500),
 *                 new Car("Toyota", "Corolla", "Black", 16200),
 *                 new Car("Toyota", "Camry", "Blue", 24000),
 *                 new Car("Nissan", "Sentra", "White", 17300),
 *                 new Car("Mitsubishi", "Lancer", "White", 20000),
 *                 new Car("Jeep", "Wrangler", "Red", 24500)
 *         );
 */

public class Car {
    private String name, model, color;
    private int price;

    public Car(String name, String model, String color, int price) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void printCar(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
