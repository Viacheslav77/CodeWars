package javaExample.main;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(LineController.isItPolindrom(" сетуй утес "));
            System.out.println(LineController.isItPolindrom("Дом мод"));
            System.out.println(LineController.isItPolindrom(" сетуй утесы "));
            System.out.println(LineController.isItPolindrom("Дом мода"));
            System.out.println(LineController.isItPolindrom(1113111));
            System.out.println(LineController.isItPolindrom(1113112));
            System.out.println(LineController.isItPolindrom(null));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class LineController {

    public static boolean isItPolindrom(int arg) throws IllegalArgumentException {
        return isItPolindrom(String.valueOf(arg));
    }
    public static boolean isItPolindrom(String arg) throws IllegalArgumentException {
        System.out.println("-------------------------------");
        System.out.print(arg + " - ");
        if (arg == null) {
            throw new IllegalArgumentException("Null can't be an agument");
        }
        String polindrom = arg.replaceAll("\\s+", "").toUpperCase();
        int polindromLenght = polindrom.length();
        int checkLenght = 0;

        if (polindromLenght % 2 == 0) {
            checkLenght = polindromLenght / 2;
        } else {
            checkLenght = (polindromLenght - 1) / 2;
        }
        for (int i = 0, j = polindromLenght - 1; i < checkLenght; i++, j--) {
            if (polindrom.charAt(i) != polindrom.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
