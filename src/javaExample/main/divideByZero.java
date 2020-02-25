package javaExample.main;

import java.util.stream.IntStream;

public class divideByZero {

    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println( 
            IntStream.of(0,a,b,0)
                .reduce(( x , y ) -> x / (y == 0 ? 1 : y))
                .getAsInt());
    }
}
