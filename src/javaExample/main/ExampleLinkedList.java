package javaExample.main;

import java.util.LinkedList;
import java.util.List;

public class ExampleLinkedList {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        list.add(12);
        list.add(3);
        list.add(6);
        list.add(3);
        System.out.println(list.remove(2));
        System.out.println(list);
    }

}
