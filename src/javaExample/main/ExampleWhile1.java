package javaExample.main;

public class ExampleWhile1 {

    public static void main(String[] args) {
        int s = 1;
        int k = 0;
        while (k < 10) {
            k += 2;
            if (k == 6) {
                continue;
            }
            s += k;
        }
        System.out.println( "s = " + s );
    }
}
