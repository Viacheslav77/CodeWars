package javaExample;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(SplitStrings.getValue("abcdef")));
        System.out.println(Arrays.toString(SplitStrings.getValue("e")));
        System.out.println(Arrays.toString(SplitStrings.getValue("")));

    }
}

class SplitStrings {

    public static String[] getValue(String str) {

        if ((str.length() - (str.length() / 2)) != 0) {
            str += "_";
        }
        String[] result = new String[str.length() / 2];

        for (int i = 0, j = 0; i < str.length() - 1; i += 2, j++) {
            result[j] = String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i + 1));
        }

        return result;

    }
}
