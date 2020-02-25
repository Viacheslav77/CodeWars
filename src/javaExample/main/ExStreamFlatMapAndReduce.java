package javaExample.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ExStreamFlatMapAndReduce {

    public static void main(String[] args) {
        
        List < Foo > foos = new ArrayList<>();

        IntStream.range( 1,4 ).forEach( i-> foos.add( new Foo("Foo" + i + " ")));
        
        foos.forEach( f -> IntStream.range(1,4).forEach( i-> f.addListBar(new Bar (" Bar" + i + " <- " + f.getName()))));
            
        // foos.stream()
        //     .forEach( f-> IntStream.range(0, 3)
        //         .forEach( i ->  System.out.println( f.getName() + f.getListBar().get(i).getName())));

       foos.stream()
            .flatMap( f-> {
                System.out.println();
                return f.getListBar().stream();})
            .forEach( f -> System.out.println(f.getName()));
         
    }

}

class Foo {
    private String name;
    private List < Bar > listBar = new ArrayList<>();;
    

    public Foo(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public List<Bar> getListBar() {
        return listBar;
    }

    public void setListBar(List<Bar> listBar) {
        this.listBar = listBar;
    }

    public void addListBar (Bar  Bar) {
        listBar.add(Bar);
    }

    
}

class Bar {
    private String name;

    public Bar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}