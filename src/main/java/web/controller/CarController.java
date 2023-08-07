package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    private final CarService service;

    public CarController(CarServiceImpl service) {
        this.service = service;
    }

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count, Model model) {
        model.addAttribute("printCar", service.getCarList(count));
        return "/cars";
    }
//    @GetMapping(value = "/cars")
//    public String printCars(@RequestParam(defaultValue = "5") Integer count, ModelMap model) {
//        CarServiceImpl carsServiceImpl = new CarServiceImpl();
//        List<Car> qtyCars = carsServiceImpl.getCarList(count);
//        model.addAttribute("cars", qtyCars);
//        return "cars";
//    }
}
