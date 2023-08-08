package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
}
