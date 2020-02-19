package javaExample.main;

public class ExampleWhile {

    public static void main(String[] args) {
        int n = 1;
        while (n++ < 5) {
            for (int i = 0; i < n ; i++) {
                System.out.print('*');
            }
            System.out.println();
        }  ;
    }
}
