package javaExample.main;



public class ExampleQuiz1{

    public static void main(String[] args) {
        int n = 33;
        int s = 0;
        while (n>0){
            s+= n % 2;
            System.out.print("s = " + s);
            n/=2;
            System.out.println(" n = " + n);
        }
        System.out.println(s);
    }
}
