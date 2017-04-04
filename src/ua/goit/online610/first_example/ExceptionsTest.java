package ua.goit.online610.first_example;

/**
 * First example about exceptions.
 *
 * Created by andreymi on 4/4/2017.
 */
public class ExceptionsTest {
    // Sometimes your program which lives you own life starts working not quite as it is expected.
    // In code sometimes situations happens called exceptions from normal flows.
    // To control this cases new java lang abstraction Exception is introduced.
    private Exception e;
    // So exception is special java object which is created when some error or exception happens.
    public static void main(String[] args) {
        // You can create exception as ordinal java object.
        Exception e1 = new Exception();
        // Exception has 3 basic construtors: default, with message and with cause.
        Exception e2 = new Exception(e1);
        // Because some exceptions may wrap other exceptions.
        // There are many exceptions in java and we will cover in next sections.
    }

}
