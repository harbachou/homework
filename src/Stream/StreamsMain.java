package Stream;

import garage.cars.Mercedes;
import garage.cars.api.ICar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamsMain {
    public static void main (String[] args) {
        List<ICar> cars = new ArrayList<>();
        cars.add(new Mercedes("GL300"));
        cars.add(new Mercedes("GL400"));
        cars.add(new Mercedes("GL500"));
        cars.add(new Mercedes("G"));
        cars.add(new Mercedes("L"));

        List<ICar> carsFiltered = cars.stream()
                .filter(ICar -> ICar != null)
                .filter(iCar -> {
                    return ICar.getModel().equals("L") ||
                            ICar.getModel().equals("G");
                })
        .collect (Collection.toList());

        for (ICar car: cars) {
            System.out.println(car);
        }
    }
}
