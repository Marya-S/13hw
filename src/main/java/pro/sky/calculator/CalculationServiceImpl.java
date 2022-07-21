package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculationServiceImpl implements CalculationService {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String sum(Double num1, Double num2) {
        double result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public String min(Double num1, Double num2) {
        double result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    public String multiply(Double num1, Double num2) {
        double result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    public String divide(Double num1, Double num2) {
        if (num2 != 0) {
            double result = num1 / num2;
            return num1 + " / " + num2 + " = " + result;
        } else return "На 0 делить нельзя!";
    }
}
