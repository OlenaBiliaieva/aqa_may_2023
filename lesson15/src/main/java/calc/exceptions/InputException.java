package calc.exceptions;

import java.io.IOException;

public class InputException extends IOException {

    private String input;

    private String inputHeader;

    public InputException(String message, String input) {
        super(message);
        this.input = input;
    }

    public InputException(String message, String input, String inputHeader) {
        super(message);
        this.input = input;
        this.inputHeader = inputHeader;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getInputHeader() {
        return inputHeader;
    }

    public void setInputHeader(String inputHeader) {
        this.inputHeader = inputHeader;
    }

    public String beautify() {
        return String.format("%s , you enter this : %s", getMessage(), input);
    }
}
