package javaExample.main;

public class TestClass {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        try {
            int n = a / b;
        } catch (ArithmeticException e) {
            System.err.print("Divide by 0");
        } finally {
            System.out.print("The end ");
        }

    }

}
