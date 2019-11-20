package java.main;

public class Main {
    public static void main(String[] args) {

    }
}

class Suite2 {

    public static String game(long n) {
        long sizeOfChessboard = n * n;
        return (sizeOfChessboard % 2) == 0 ? ("" + "[" + sizeOfChessboard / 2 + "]")
                : ("" + "[" + sizeOfChessboard + ", 2]");

    }
}
