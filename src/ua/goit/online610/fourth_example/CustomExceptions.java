package ua.goit.online610.fourth_example;

/**
 * Example about custom exceptions.
 * <p>
 * Created by andreymi on 4/4/2017.
 */
public class CustomExceptions {
    // You can create you own exception and handle it
    private static class TestException extends Exception {
        private int value;

        TestException(String message, int value) {
            super(message);
            this.value = value;
        }
    }
    // Another exception...
    private static class TestException2 extends Exception {

    }

    private static void run() throws TestException, TestException2 {
        throw new TestException("Test", 1);
    }

    public static void main(String[] args) {
        try {
            run();
            // Suppose exception is throws more then 1 exception..
            // You must specify two catches...or must not if they do same.
        } catch (TestException e) {
            e.printStackTrace();
        } catch (TestException2 e2) {
            e2.printStackTrace();
        }

        try {
            run();
            // This makes possibible since Java version 7.
        } catch (TestException | TestException2 e) {
            e.printStackTrace();
        }

        // Exceptions are handled by calling eirarchy
        try {
            run();
            // This makes possibible since Java version 7.
        } catch (TestException | TestException2 e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Others");
            // Some exceptions, maybe unchecked which are not handled.
            e.printStackTrace();
        }
        // But if you specify exception before realization it will fall.
    }
}
