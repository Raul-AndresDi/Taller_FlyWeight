package flyweight;

public class VehicleFlyweight {

    private final String brand;
    private final String model;
    private final String color;

    public VehicleFlyweight(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public void displayDetails(String licensePlate, float x, float y, float speed) {
        System.out.printf("Vehicle: %s %s (%s), License Plate: %s, Pos: (%.2f, %.2f), Speed: %.2f%n",
                brand, model, color, licensePlate, x, y, speed);
    }
}