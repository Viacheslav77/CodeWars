
package javaExample.main;

public class Examlle_If {

    public static void main( String []args  ) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (a == true) {
            if (b == true) {
                if (c == true) {
                    System.out.println("1");
                } else
                    System.out.println("2");
            } else if (a && (b = c)) {
                System.out.println("3");
            }
        } else
            System.out.println("4");

    }

}
