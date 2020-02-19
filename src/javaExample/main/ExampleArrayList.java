package javaExample.main;

import java.util.ArrayList;

import java.util.List;

public class ExampleArrayList {

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(15);
        lst.add(7);
        System.out.println(sum(lst));
    }

    static int sum(List<Integer> list) {
        int sum = 0;
        for (Integer k : list) {
            sum = sum + ++k;
        }
        return sum;
    }
}
