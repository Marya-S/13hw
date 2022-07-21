package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculationController {
    private final CalculationService calculationService;

    public CalculationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping()
    public String hello() {
        return calculationService.hello();
    }

    @GetMapping(path = "/plus")
    public String sum(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return calculationService.sum(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String min(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return calculationService.min(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return calculationService.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return calculationService.divide(num1, num2);
    }

}
