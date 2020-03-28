package javaExample.main;

import java.util.Arrays;

public class ExOverloading {

    public static void main(String[] args) {
        Overloading ol = new Overloading();
        short b = 5;
        ol.method(b);

    }
    
}
class Overloading {


    void method(byte... i) {
        System.out.println("byte..." + Arrays.toString(i));
    }
    void method(short... i) {
        System.out.println("short..." + Arrays.toString(i));
    }

    // void method(short i) {
    //     System.out.println("short");
    // }

    // void method(int i) {
    //     System.out.println("int");
    // }
    // void method(long i) {
    //     System.out.println("long");
    // }
    // void method(float i) {
    //     System.out.println("float");
    // }
    // void method(double i) {
    //     System.out.println("double");
    // }
  
    // void method(Short i) {
    //     System.out.println("Short");
    // }

    void method(Integer i) {
        System.out.println("Integer");
    }
    void method(Long i) {
        System.out.println("Long");
    }
    void method(Float i) {
        System.out.println("Float");
    }
    void method(Double i) {
        System.out.println("Double");
    }
    // void method(Object i) {
    //     System.out.println("Object");
    // }
  

}
