package guru.qa.service.operation;

import guru.qa.service.Writer;

public class ConsoleWriter implements Writer {


        @Override
        public String handleString(String inputString) {
            System.out.println(inputString);
            return null;
        }
}
