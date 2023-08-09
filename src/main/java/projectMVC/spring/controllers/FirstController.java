package projectMVC.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {

        model.addAttribute("message", "Hello, " + name + " " + surname);

        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String calculatorPage(@RequestParam(value = "a") double a, @RequestParam(value = "b") double b, @RequestParam(value = "action") String action, Model model) {
        if (action.equals("division") & b == 0) {
            model.addAttribute("errMessage", "ERROR! DIVISION by 0!");
            return "first/calculator";
        }

        double result = switch (action) {
            case "addition" -> a + b;
            case "subtraction" -> a - b;
            case "multiplication" -> a * b;
            case "division" -> a / b;
            default -> 0.0;
        };

        model.addAttribute("resultString", "The result of your calculation is: " + result);

        return "first/calculator";
    }
}
