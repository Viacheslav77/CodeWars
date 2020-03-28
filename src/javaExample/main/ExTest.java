package javaExample.main;

public class ExTest implements DeclareStuff {

    public static void throwIt() {
        System.out.println("throwIt");
        throw new RuntimeException("efwfwefwew");
    }

    public static void main(String[] args) {

        try {
            System.out.println("hello");
            throwIt();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
            System.out.println("catch");
        }finally {
            System.out.println("finally");
        }

        System.out.println("finish");

        ExTest foo = new ExTest();
        foo.doStuff(5);

        Test6 f2 = new Test6();
        try {
            int x = 0;
            int b = 5 / x;
        } catch (Exception e) {
           System.out.println(e);
        }

    }

    @Override
    public void doStuff(int s) {
        s += EASY + ++s;
        System.out.println("s = " + s);
    }

}

class Test6 {

    public Test6() {
        this((byte) 4);
    }

    public Test6(byte i) {
        System.out.println(i);
    }

}

interface DeclareStuff {
    public static final int EASY = 3;

    void doStuff(int t);
}
