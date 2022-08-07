package pro.sky.calculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculationServiceImplTest {
    static CalculationService calculationService;

    @BeforeAll
    static void setUp() {
        calculationService = new CalculationServiceImpl();

    }
    @Test
    void sum() {
        String expectedResult = "3.0 + 2.5 = 5.5";
        String actualResult =calculationService.sum(3.0,2.5);
        Assertions.assertEquals(expectedResult, actualResult, "Sum is wrong");
    }
    @Test
    void sumNull() {
        String expectedResult = "0.0 + 0.0 = 0.0";
        String actualResult = calculationService.sum(0.0,0.0);
        Assertions.assertEquals(expectedResult, actualResult, "Sum is wrong");
    }

    @Test
    void min() {
        String expectedResult = "9.0 - 5.5 = 3.5";
        String actualResult = calculationService.min(9.0,5.5);
        Assertions.assertEquals(expectedResult,actualResult,"Mun is wrong");
    }

    @Test
    void minNegative() {
        String expectedResult = "3.0 - 5.5 = -2.5";
        String actualResult = calculationService.min(3.0,5.5);
        Assertions.assertEquals(expectedResult,actualResult,"Mun is wrong");
    }

    @Test
    void multiply() {
        String expectedResult = "3.0 * 5.5 = 16.5";
        String actualResult = calculationService.multiply(3.0,5.5);
        Assertions.assertEquals(expectedResult,actualResult,"Multiply is wrong");
    }

    @Test
    void multiplyNegative() {
        String expectedResult = "-3.4 * 4.0 = -13.6";
        String actualResult = calculationService.multiply(-3.4,4.0);
        Assertions.assertEquals(expectedResult,actualResult,"Multiply is wrong");
    }

    @Test
    void divide() {
        String expectedResult = "12.0 / 4.0 = 3.0";
        String actualResult =calculationService.divide(12.0,4.0);
        Assertions.assertEquals(expectedResult,actualResult,"Divide is wrong");
    }

    @Test
    void divideException() {
        Assertions.assertThrows(IllegalArgumentException.class,() -> {calculationService.divide(4.0,0.0);});
    }

    @Test
    void hello() {
        String expectedResult = "Добро пожаловать в калькулятор";
        String actualResult =calculationService.hello();
        Assertions.assertEquals(expectedResult, actualResult, "Hello doesn't work");
    }

}