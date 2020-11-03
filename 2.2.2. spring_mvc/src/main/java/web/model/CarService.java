package web.model;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private static final List<Car> cars;
    static {
        cars = new ArrayList<>();
        cars.add(new Car("Audi A3",300,4000000));
        cars.add(new Car("Dodge Challenger",5000000,4000000));
        cars.add(new Car("Chevrolet Camaro",290,3000000));
        cars.add(new Car("LADA PRIORA b/y",160,40000));
        cars.add(new Car("Toyota Rav4",190,2000000));
    }

    public static List<Car> getCars(int number) {
        List<Car> messages = new ArrayList<>();
        for(int i = 0; i<number; i++){
            messages.add(cars.get(i));
        }
        return messages;
    }
}
