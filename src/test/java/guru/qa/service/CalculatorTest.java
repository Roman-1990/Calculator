package guru.qa.service;

import guru.qa.service.mock.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorTest {

    private Calculator calculator;

    @Test
    void calculatorMultTest() {
        calculator = new Calculator(new MockMultReader(), new MockMessageWriter());
        String result = calculator.start();
        Assertions.assertEquals("5 * 5 = 25", result);
    }

    @Test
    void calculatorSumTest() {
        calculator = new Calculator(new MockSumReader(), new MockMessageWriter());
        String result = calculator.start();
        Assertions.assertEquals("3 + 7 = 10", result);
    }

    @Test
    void calculatorMinusTest() {
        calculator = new Calculator(new MockMinusReader(), new MockMessageWriter());
        String result = calculator.start();
        Assertions.assertEquals("15 - 5 = 10", result);
    }

    @Test
    void calculatorDivideTest() {
        calculator = new Calculator(new MockDivideReader(), new MockMessageWriter());
        String result = calculator.start();
        Assertions.assertEquals("10 / 2 = 5", result);
    }

    @Test
    void calculatorExpTest() {
        calculator = new Calculator(new MockExpReader(), new MockMessageWriter());
        String result = calculator.start();
        Assertions.assertEquals("5 ^ 5 = 3125", result);
    }

}
