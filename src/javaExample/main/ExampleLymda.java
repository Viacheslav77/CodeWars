package javaExample.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleLymda<k> {

    public static void main(String[] args) {
        IPrint pr = new IPrint() {
            @Override
            public void printString(String arg) {
                System.out.println("Print " + arg);
            }
        };

        IPrint pr1 = m -> System.out.println("Print " + m);
        IPrint pr2 = m -> {
            System.out.println("-------------");
            System.out.println("Print " + m);
            System.out.println("-------------");
        };

        IPrint pr3 = System.out::println;

        pr.printString("Hi!!");
        pr1.printString("Hi lymda");
        pr2.printString("Hi ly2");
        pr3.printString("Hi ly3");

        Map<String, IPrint> printerHub = new HashMap<>();

        printerHub.put("one", m -> System.out.println("One - printerHub + " + m));
        printerHub.put("two", System.out::println);
        printerHub.put("three", 
            m -> {
                System.out.println("***********");
                System.out.println("three " + m);
                System.out.println("***********");
        });

        printerHub.get("one").printString("Hello1");
        printerHub.get("two").printString("Hello2");
        printerHub.get("three").printString("Hello3");

        List<String> emList = Arrays.asList("Nasty", "Kosty", "Pety", "Nensi", null);
        List<String> filterNames = new ArrayList<>();

        emList.stream()
            .filter(n -> n != null ? n.startsWith("N") : false)
            .forEach(System.out::println);
        emList = null;

        filterNames =  emList == null ? new ArrayList <> () : 
                emList.stream()
                    .filter( n -> n != null ? n.startsWith("N") : false )
                    .collect(Collectors.toList());

        System.out.println(filterNames);

        Stream.of("aa1", "aa2", "aa3", "aa4", null)
            .filter(s -> {
                s = s != null ? s : "Null";
                System.out.println("filter " + s);
                return s.startsWith("a");
            })
            .sorted((s1, s2) -> {
                return s1.compareTo(s2);
            })
            .forEach(s -> System.out.println("forEach" + s));
        ;

    }
}

@FunctionalInterface
interface IPrint {
    void printString(String arg);

}
