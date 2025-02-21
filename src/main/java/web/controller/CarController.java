package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String Cars(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count, Model model) {

        CarService carService = new CarServiceImpl();
        List<Car> carList = carService.getCars(count);

        model.addAttribute("carList", carList);

        return "cars";
    }
}
