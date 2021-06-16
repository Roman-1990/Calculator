package guru.qa;

import guru.qa.service.Calculator;
import guru.qa.service.operation.ConsoleReader;
import guru.qa.service.operation.ConsoleWriter;

public class Application {
    public static void main(String[] args) {
        String result = new Calculator(new ConsoleReader(), new ConsoleWriter()).start();
        System.out.println(result);
    }
}
