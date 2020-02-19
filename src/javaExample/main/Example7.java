package javaExample.main;

import java.util.Arrays;
import java.util.List;

public class Example7 {

    public static void main(String[] args) {
        Example7 example = new Example7();
        List<Integer> integers = Arrays.asList( 15, 10, 7, 42 );   
        MyInterface m = example::getNumber;
        System.out.println(m.get(integers));
    }

    int getNumber(List<Integer> list) {
        return list.stream().reduce((x, y) -> x + y).get();
    }

    @FunctionalInterface
    interface MyInterface {
        int get(List<Integer> list);
    }

}
