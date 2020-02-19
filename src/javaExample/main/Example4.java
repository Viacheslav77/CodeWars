package javaExample.main;

import java.util.Arrays;
import java.util.List;

public class Example4 {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("S1", "S2", "S3", "S4");
        List<String> list2 = Arrays.asList("S2", "S3");
        System.out.println(list1.contains(list2));
    }
}
