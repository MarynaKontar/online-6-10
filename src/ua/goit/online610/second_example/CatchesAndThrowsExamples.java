package ua.goit.online610.second_example;

import java.io.IOException;

/**
 * Examples about caches and throws.
 * <p>
 * Created by andreymi on 4/4/2017.
 */
public class CatchesAndThrowsExamples {
    public static void main(String[] args) {
        // So logical questions come: how handle exceptions, how to know that we handle them, and how to throw them?
        Test t = new Test();
        try {
            t.write(new byte[]{});
            // To specify that exception is handled - used special keyword catch and then exception which you
            // want to handle.
        } catch (IOException e) {
            System.out.println("Inside catch!");
            e.printStackTrace();
        } finally {
            // Special block exists - finally.
            // Finally we execute in any case, no matter exception is raised or not (except System.exit or kill -9 ) of course.
            System.out.println("Inside finally!");
        }
    }

    // We can rethrow exception.
    private static void write(Test t, byte[] data) throws IOException {
        t.write(data);
    }

    // We have test class name Test which has method write data into disk.
    private static class Test {
        // To tell other world that method may produce exception special keyword 'throws' applied.
        // Method may throw more then 1 exception and they must be written one by one after comma
        void write(byte[] data) throws IOException, IndexOutOfBoundsException {
            if (data.length == 0) {
                // To throw exception when some problem happens - use 'throw' keyword.
                throw new IOException("Data provided cannot be null!");
            }
        }
    }
}
