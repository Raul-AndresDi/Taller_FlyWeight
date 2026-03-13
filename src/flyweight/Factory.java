package flyweight;

import java.util.HashMap;
import java.util.Map;

public class Factory {
     private static final Map<String, VehicleFlyweight> flyweights = new HashMap<>();

    public static VehicleFlyweight getFlyweight(String marca, String modelo, String color) {
        String clave = marca + "_" + modelo + "_" + color;
        return flyweights.computeIfAbsent(clave, k -> new VehicleFlyweight(marca, modelo, color));
    }

    public static int getCacheSize() {
        return flyweights.size();
    }
    
}
