package guru.qa.service;

import guru.qa.service.operation.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperationHandlerTest {
    private OperationHandler handler;

    @Test
    void sumTest() {
        handler = new SumOperationHandler();
        int sum = handler.invoke(3,5);
        Assertions.assertEquals(8, sum);

    }

    @Test
    void multTest() {
        handler = new MultOperationHandler();
        int mult = handler.invoke(3,5);
        Assertions.assertEquals(15, mult);
    }

    @Test
    void minusTest() {
        handler = new MinusOperationHandler();
        int minus = handler.invoke(10,5);
        Assertions.assertEquals(5, minus);
    }

    @Test
    void dicvideTest() {
        handler = new DividerOperationHandler();
        int divide = handler.invoke(10,5);
        Assertions.assertEquals(2, divide);
    }

    @Test
    void expoTest() {
        handler = new ExpoOperationHandler();
        int expo = handler.invoke(5,5);
        Assertions.assertEquals(3125, expo);
    }
}
