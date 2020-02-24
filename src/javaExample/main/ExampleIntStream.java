package javaExample.main;

import java.util.stream.IntStream;


public class ExampleIntStream {

    public static void main(String[] args) {
        
        System.out.println("from 0 to 10 sum = " + IntStream.range(0, 10).sum());
        System.out.println("from 0 to 10 average = " + IntStream.range(0, 10).average().getAsDouble());
        System.out.println("from 0 to 10 max = " + IntStream.range(0, 10).max().getAsInt());
        System.out.println("from 0 to 10 min = " + IntStream.range(0, 10).min().getAsInt());
 
    }

  
}
