package flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        long start = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        
        List<Vehicle> vehicles = new ArrayList<>();
        Random rand = new Random();
        
        // 4 million vehicles
        for (int i = 0; i < 4_000_000; i++) {
            String brand = (i % 3 == 0) ? "Toyota" : (i % 3 == 1) ? "Honda" : "Ford";
            String model = "Model " + i;
            String color = (i % 2 == 0) ? "Red" : "Blue";
            String licensePlate = "LP" + String.format("%06d", i);
            float x = rand.nextFloat() * 100f;
            float y = rand.nextFloat() * 100f;
            float speed = rand.nextFloat() * 200f;
            
            vehicles.add(new Vehicle(brand, model, color, licensePlate, x, y, speed));
        }
        
        long end = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Approximate memory used: " + (end - start) / (1024 * 1024) + " MB");
        System.out.println("Unique Flyweights: " + Factory.getCacheSize());
        
        // Examples
        System.out.println("\nExamples:");
        for (int i = 0; i < 50; i++) {
            vehicles.get(i).display();
        }
        
        vehicles.get(0).move(10.5f, 20.3f, 150.0f);
        System.out.println("\nAfter moving:");
        vehicles.get(0).display();
    }
}
