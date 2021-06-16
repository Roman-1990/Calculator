package guru.qa.service;

public enum Messages {
    ENTER_TWO_NUMBERS("Enter 2 numbers: "),
    ENTER_OPERATOR("Enter operator (+, *, -, /, ^): "),
    RESULT("Result: ");

    private final String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
