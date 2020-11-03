package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.model.CarService;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false) Integer value, ModelMap model) {
        if(value==null || value>5){
            model.addAttribute("messages", CarService.getCars(5));
        }
        else {
            List<Car> messages = CarService.getCars(value);
            model.addAttribute("messages", messages);
        }
        return "cars";
    }
}
