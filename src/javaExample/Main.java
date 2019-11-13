package javaExample;

import java.util.Arrays;

public class Main {

public static void main(String[] args) {

    Xbonacci variabonacci = new Xbonacci();

    System.out.println( Arrays.toString(new double []{1,1,1,3,5,9,17,31,57,105}));
    System.out.println( Arrays.toString(variabonacci.tribonacci(new double []{1,1,1},10)));
    System.out.println( Arrays.toString(new double []{0,0,1,1,2,4,7,13,24,44})); 
    System.out.println( Arrays.toString(variabonacci.tribonacci(new double []{0,0,1},10)));
    System.out.println( Arrays.toString(new double []{0,1,1,2,4,7,13,24,44,81}));
    System.out.println( Arrays.toString(variabonacci.tribonacci(new double []{0,1,1},10)));
}

}
