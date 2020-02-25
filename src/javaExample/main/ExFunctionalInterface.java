package javaExample.main;

import java.util.Arrays;
import java.util.List;

public class ExFunctionalInterface {

    public static void main(String[] args) {
        ExFunctionalInterface example = new ExFunctionalInterface();
        List<Integer> integers = Arrays.asList( 15, 10, 7, 42 , null);   
        MyInterface m = example::getNumber;
        System.out.println( m.myGet(integers) );
        System.out.println( m.myGet(null) );
    }

    int getNumber( List< Integer > list ) {
        return list == null ?  0 :
            list.stream()
                .filter( x -> x!=null )
                .reduce((x, y) -> x + y)
                .get();
    }

    @FunctionalInterface
    interface MyInterface {
        int myGet( List<Integer> list );
    }

}
