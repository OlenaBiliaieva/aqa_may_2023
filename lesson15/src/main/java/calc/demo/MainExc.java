package calc.demo;

import java.io.IOException;

public class MainExc {

    public static void main(String[] args) {
        System.out.println(getNumber());
    }

    public static int getNumber() {
        try {
            getException();
            System.out.println("Hello");
            return 2;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return 3;
        } finally {
            return 5;
        }
    }

    public static void getException() throws IOException {
        throw new IOException("Exception is here");
    }
}
