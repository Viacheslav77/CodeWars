package javaExample.main;

import java.util.Random;
import java.util.function.*;


public class ExFunctional2 {

    public static void main(String[] args) {

        Predicate < Integer> predicate = p -> p > 5;
        System.out.println(predicate.test(5));

        Consumer < Integer > consumer = x -> System.out.println(x);
        consumer.accept(111);

        Supplier <Integer> supplier = () -> new Random ().nextInt(1000);
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        UnaryOperator < Integer > unaryOperator = x -> x * x;
        System.out.println( unaryOperator.apply(55) );
        
        BinaryOperator < Integer > binaryOperator = ( x, y ) -> x * y ;
        System.out.println(binaryOperator.apply(50, 10));

        BiConsumer < Integer, Integer > biConsumer = ( x, y ) -> System.out.println(x + y);
        biConsumer.accept(12, 23);

        Function <Integer, Integer> function = x -> x++;
        Function <Integer, Integer> function1 = new Function <Integer, Integer> () {

            @Override
            public Integer apply(Integer t) {
                return t.hashCode();
            }
            
        };

        System.out.println(function.apply(44));

       
    }



}
