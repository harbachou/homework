package garage;

import garage.cars.Mercedes;
import garage.parts.engine.MercedesEngine;
import garage.parts.engine.NoNameEngine;

public class GarageMain {
    public static void main(String[] args) {
        Mercedes mercedes1 = new Mercedes("GL666", new MercedesEngine());
        Mercedes mercedes2 = new Mercedes("GL666", new NoNameEngine());
    }
}
