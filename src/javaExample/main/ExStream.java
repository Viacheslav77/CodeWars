package javaExample.main;

import java.util.stream.Stream;

public class ExStream {

    public static void main(String[] args) {
        
        Stream.of("aa1","bb2","cc3",null)
            .map( s -> s == null ? "0" : s.substring(2))
            .mapToInt(Integer::parseInt).max()
            .ifPresent(System.out::println);

        Stream.of( "", null )
            .map( s -> s == null || s == "" ? "0" : s.substring(2))
            .mapToInt(Integer::parseInt).max()
            .ifPresent(System.out::println);
        

    }

}
