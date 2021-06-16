package guru.qa.service;

import guru.qa.service.mock.MockMessageWriter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class WriterTest {
    MockMessageWriter writer = new MockMessageWriter();

    @Test
    void enterTwoNumbersMessageTest() {
        Assertions.assertEquals("Enter 2 numbers: ", writer.handleString(Messages.ENTER_TWO_NUMBERS.getMessage()));
    }

    @Test
    void enterOperatorMessageTest() {
        Assertions.assertEquals("Enter operator (+, *, -, /, ^): ", writer.handleString(Messages.ENTER_OPERATOR.getMessage()));
    }

    @Test
    void resultMessageTest() {
        Assertions.assertEquals("Result: ", writer.handleString(Messages.RESULT.getMessage()));
    }
}
