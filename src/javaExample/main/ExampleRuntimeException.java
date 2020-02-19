package javaExample.main;

public class ExampleRuntimeException {

    public static void main(String[] args) {
        new ExampleRuntimeException ().m1();
    }
    public void m1() {
        System.out.print("Method 1 ");
        try {
            m2();
        } catch (RuntimeException e) {
            System.out.print("RuntimeException ");
        } catch (Exception e) {
            System.out.print("Exception ");
        } finally {
            System.out.print("Finally ");
        }
    }
    public void m2() {
        if (false) { System.out.print("Method 2 "); }
        throw new RuntimeException();
    }
}
