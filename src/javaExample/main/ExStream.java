package javaExample.main;

import java.util.Arrays;

import java.util.stream.IntStream;


public class ExStream {

    public static void main(String[] args) {
        
       int [] arr = IntStream.rangeClosed(1, 5).toArray();

       int [] arr1 = new int[6];

       ChangeIt.goIt(arr);

       for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
       }
    }

    }

    class ChangeIt {

      public static void goIt( int [] arr) {
          arr = null;
          System.out.println(Arrays.toString(arr));
      }
    
        
    }

    