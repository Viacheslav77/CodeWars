package javaExample.main;

public class Example {

    public static void main(String[] args) {
        int x = 4;
        int n1 = 5 <= ++x ? 3 : 2;   // 5 <= 5 true -> n1 = 3
        switch (n1) {
        default:
            System.out.print("NAN");
        case 1:
            System.out.print("1");
        case 3:                      
            System.out.print("3"); // -> print 3
        case 2:
            System.out.print("2"); // -> print 2 on the same line
            break;
        }
    }
}
