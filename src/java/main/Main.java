package java.main;

public class Main {
    public static void main(String[] args) {

       String str = "сетуй утес";
       System.out.println(str.trim());

    }
}

class Polindrom {

    public static boolean funcName(String arg) {
        int arrLenght = arg.length();

        for (int i = 0, j = arrLenght; i < arrLenght; i++, j++) {

            if (arg.charAt(i) != arg.charAt(j)) {
                return false;
            }

        }
        return false;
    }

}
