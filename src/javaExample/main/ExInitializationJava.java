package javaExample.main;

public class ExInitializationJava {

    public static void main(String[] args) {
        StaticEx se = new StaticEx ();
    }
}

class StaticEx {

    StaticEx (){
        System.out.println(" Construcktor i = " + i);
     }

     {
        System.out.println(" Non Static block");
     }

     static int i = 4;
     static {
         System.out.println(" Static block");
     }



}

class ExConstructor {

    public ExConstructor(int i) {
        System.out.println("Constructor 1");
    }
    
    public ExConstructor() {
      this(4);
      System.out.println("Constructor 2");
    }
}

