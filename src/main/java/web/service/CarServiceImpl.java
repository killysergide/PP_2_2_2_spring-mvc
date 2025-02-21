package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCars(int count) {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Toyota", "Camry", 2020));
        carList.add(new Car("Ford", "Mustang", 2021));
        carList.add(new Car("BMW", "X5", 2019));
        carList.add(new Car("Honda", "Civic", 2022));
        carList.add(new Car("Tesla", "Model 3", 2023));

        if (count > carList.size()) {
            count = carList.size();
        }

        return carList.subList(0, count);
    }
}
