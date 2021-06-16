package guru.qa.service.mock;


import guru.qa.service.Writer;


public class MockMessageWriter implements Writer {

        @Override
        public String handleString(String inputString) {
            System.out.println(inputString);
            return inputString;
        }
}
