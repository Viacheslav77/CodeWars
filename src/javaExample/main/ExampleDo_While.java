package javaExample.main;

public class ExampleDo_While {

    public static void main(String[] args) {
        int i, n = 1;
        do {
            for (i = 0; i < n ; i++) {
                System.out.print('*');
            }
            System.out.println();
        } while (n++ < 5) ;
    }
}
