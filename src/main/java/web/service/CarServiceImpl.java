package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Renault", "Megan", 2004));
        carList.add(new Car("Mercedes-Benz", "GLS", 2015));
        carList.add(new Car("BMW", "X6", 2019));
        carList.add(new Car("ВАЗ", "Калина", 2020));
        carList.add(new Car("Toyota", "Corolla", 2018));
    }

    public CarServiceImpl() {
    }

    @Override
    public List<Car> getCarList(Integer count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}