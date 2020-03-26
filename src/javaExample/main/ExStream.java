package javaExample.main;

import java.util.Arrays;

import java.util.stream.IntStream;


public class ExStream {

    public static void main(String[] args) {


        // try {
        //    return; 
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        
        
       int [] arr = IntStream.rangeClosed(1, 5).toArray();

       int [] arr1 = new int[6];

       ChangeIt.goIt(arr);

       for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
       }
       char ch = 0x000A;
       System.out.print(ch);

       String a = new String("abc");
       String b = new String("abc");

       System.out.println(a.equals(b));
       System.out.println(a == b);

       String c = new String("ab");
       String d = "abc";
       String e = c + "c";

       System.out.println(c.equals(e));
       System.out.println(c == e);

       System.out.println(5/0);
    }

    
     

    }

    class ChangeIt {

      public static void goIt( int [] arr) {
          arr = null;
          System.out.println(Arrays.toString(arr));
      }

        
    }

    