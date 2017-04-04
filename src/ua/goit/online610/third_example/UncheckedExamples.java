package ua.goit.online610.third_example;

import java.io.IOException;

/**
 * Examples for unchecked exceptions.
 * <p>
 * Created by andreymi on 4/4/2017.
 */
public class UncheckedExamples {
    public static void main(String[] args) {
        Test t = new Test();
        t.write(new byte[]{});
        // Unchecked exception are those which are subclassed of RuntimeException.
        // Examples are: NullPointerException, IllegalStateException, IllegalArgumentException, IndexOutOfBoundException,
        // ArithmeticException and many, many more.

    }

    // Return to our class Test.
    private static class Test {
        // Special types of exceptions exists in java that you may not specify in throws: unchecked exceptions.
        // Their nature is they may happens in situation which you are not expect.
        // Famous example: NullPointerException
        void write(byte[] data) {
            if (data.length == 0) {
                // Now we throw exception, but it is not specified and not known.
                throw new IllegalArgumentException("Data provided cannot be null!");
            }
        }
    }

    // You can wrap catched exception into unchecked.
    private static void write(Test2 t, byte[] data) {
        try {
            t.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Return to our class Test.
    private static class Test2 {
        // Special types of exceptions exists in java that you may not specify in throws: unchecked exceptions.
        // Their nature is they may happens in situation which you are not expect.
        // Famous example: NullPointerException
        void write(byte[] data) throws IOException {
            if (data.length == 0) {
                // Now we throw exception, but it is not specified and not known.
                throw new IOException("Data provided cannot be null!");
            }
        }
    }
}
