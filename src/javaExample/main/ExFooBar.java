package javaExample.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExFooBar {

    public static void main(String[] args) {

        List<Foo> foos = new ArrayList<>();

        //Create foos
        IntStream.range(1, 4).forEach(i -> foos.add(new Foo("Foo" + i)));
        // create bars
        foos.forEach( f -> IntStream.range(1, 4)
            .forEach( i -> f
            .setNewBar( new Bar("Bar" + i + " <- " + f.getName())))
        );

        foos.stream()
            .flatMap( f -> f.getBars().stream())
            .forEach( b -> System.out.println( b.getName() ));

        foos.stream()
            .peek( f-> System.out.println("by peek" +f.getName()))
            .flatMap( f-> f.getBars().stream())
            .forEach( b-> System.out.println( " " + b.getName()));

        foos.stream()
        .forEach( f -> {
            System.out.println( f.getName());
        f.getBars()
            .stream()
                .forEach( b -> System.out.println( "  " + b.getName()));
        
        });

        List < Foo > superFoos = IntStream.range(1, 4)
            .mapToObj( i -> new Foo("SuperFoo" + i))
            .peek( f-> IntStream.range(1, 4).forEach( i -> f.setNewBar( new Bar ("SuperBar"+ i + " <- "+ f.getName()))) )
            .collect(Collectors.toList());
            
        superFoos.stream()
            .peek( f -> System.out.println(f.getName()) )
            .flatMap( f -> f.getBars().stream())
                             .forEach( b -> System.out.println( " -:" + b.getName()) );
           
    }

}

class Foo {
    private String name;
    private List<Bar> bars = new ArrayList<>();

    public Foo(String name) {
        this.name = name;
    }

    public List < Bar > getBars() {
        return bars;
    }

    public void setNewBar( Bar newBar ) {
        bars.add( newBar );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setName(String name) {
        this.name = name;
    }

}
