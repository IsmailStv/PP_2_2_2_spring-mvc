package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    List<Car> carList = new ArrayList<>();

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
        List<Car> newCarlist = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            newCarlist.add(carList.get(i));
        }
        return newCarlist;
    }
//    @Override
//    public List<Car> carList(Integer count) {
//        List<Car> carList;
//        {
//            carList = new ArrayList<>();
//            carList.add(new Car("Renault", "Megan", 2004));
//            carList.add(new Car("Mercedes-Benz", "GLS", 2015));
//            carList.add(new Car("BMW", "X6", 2019));
//            carList.add(new Car("ВАЗ", "Калина", 2020));
//            carList.add(new Car("Toyota", "Corolla", 2018));
//        }
//        return carList.stream().limit(count).collect(Collectors.toList());
//    }
}