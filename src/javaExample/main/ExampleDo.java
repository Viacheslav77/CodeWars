package javaExample.main;

public class ExampleDo {

    public static void main(String[] args) {
        int sum = 0;
        
            for (int i = 0; i < 10 ; i++) {
                sum +=i;
            }
            System.out.println("sum = " + sum);

            for (short i = 32766; i < 032767; i++) {
                System.out.println(i);
            }
            
            short i = 32766;

            do {
                System.out.println( i);
                i++;
            } while ( i < 32767);
            
        
    }

  
}
