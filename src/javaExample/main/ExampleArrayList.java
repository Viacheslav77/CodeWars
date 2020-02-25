package javaExample.main;

import java.util.Arrays;
import java.util.List;

public class ExampleArrayList {

    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList( 15, 20, 45, null );
        System.out.println(sum(lst));
        System.out.println(sum(null));
    }

    static int sum(List<Integer> list) {
        return list == null ? 0 : 
        list.stream()
            .map( x -> x == null ? 0 : x)
            .reduce((x, y) -> x + ++y )
            .get();
    }
}
