package guru.qa.service.operation;

import guru.qa.service.OperationHandler;

public class ExpoOperationHandler implements OperationHandler {
    @Override
    public int invoke(int first, int second) {
        return (int)(Math.pow(first, second));
    }

}
