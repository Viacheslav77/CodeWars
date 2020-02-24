
package javaExample.main;

public class ExampleTer {

    public static void main( String[] args ) {
        boolean a = true,  b = false, c = true;

        System.out.println( 
            a == true ? ( b == true ? 
                ( c == true ? "1" : "2") : 
                    (a && (b = c) ? "3" : "")) 
            : "4");

    }

}
