package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.CarService;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false) String value, ModelMap model) {
        int number = 5;
        try {
            number = Integer.parseInt(value);
        } catch (NumberFormatException e){
            System.out.println("Переданный параметр не является числом");
        }
        List<String> messages = CarService.getCars(number);
        model.addAttribute("messages", messages);
        return "cars";
    }
}
