package pro.sky.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculationServiceImplParametrizedTest {
    static CalculationService calculationService;

    @BeforeAll
    static void setUp() {
        calculationService = new CalculationServiceImpl();

    }

    @ParameterizedTest
    @CsvSource(value = {"3.0, 2.5, '3.0 + 2.5 = 5.5'",
            "-5.5, 3.5, '-5.5 + 3.5 = -2.0'",
            "4.0, -2.5, '4.0 + -2.5 = 1.5'",
            "0.0, 5.5, '0.0 + 5.5 = 5.5'"})
    void sum(Double num1, Double num2, String expectedResult) {
        String actualResult = calculationService.sum(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult, "Sum is wrong");
    }

    @ParameterizedTest
    @CsvSource(value = {"3.0, 2.5, '3.0 - 2.5 = 0.5'",
            "-5.5, 3.5, '-5.5 - 3.5 = -9.0'",
            "4.0, -2.5, '4.0 - -2.5 = 6.5'",
            "0.0, 5.5, '0.0 - 5.5 = -5.5'"})
    void min(Double num1, Double num2, String expectedResult) {
        String actualResult = calculationService.min(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult, "Num is wrong");
    }

    @ParameterizedTest
    @CsvSource(value = {"3.0, 2.5, '3.0 * 2.5 = 7.5'",
            "-5.5, 3.5, '-5.5 * 3.5 = -19.25'",
            "4.0, -2.5, '4.0 * -2.5 = -10.0'",
            "0.0, 5.5, '0.0 * 5.5 = 0.0'"})
    void multiply(Double num1, Double num2, String expectedResult) {
        String actualResult = calculationService.multiply(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult, "Multiply is wrong");
    }

    @ParameterizedTest
    @CsvSource(value = {"6.0, 2.5, '6.0 / 2.5 = 2.4'",
            "-5.5, 2.5, '-5.5 / 2.5 = -2.2'",
            "5.5, -2.5, '5.5 / -2.5 = -2.2'",
            "0.0, 5.5, '0.0 / 5.5 = 0.0'"})
    void divide(Double num1, Double num2, String expectedResult) {
        String actualResult = calculationService.divide(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult, "Divide is wrong");
    }

}
