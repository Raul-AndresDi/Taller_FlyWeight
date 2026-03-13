package flyweight;

class Vehicle {
    private final VehicleFlyweight flyweight;
    private final String licensePlate;
    private float x, y;  // Position as float
    private float speed; // Speed as float

    public Vehicle(String brand, String model, String color, String licensePlate, float x, float y, float speed) {
        
        this.flyweight = Factory.getFlyweight(brand, model, color);
        this.licensePlate = licensePlate;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void display() {
        flyweight.displayDetails(licensePlate, x, y, speed);
    }

    public void move(float newX, float newY, float newSpeed) {
        this.x = newX;
        this.y = newY;
        this.speed = newSpeed;
    }
}