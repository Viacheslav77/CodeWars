package javaExample;

import java.util.Arrays;

public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {

        double[] tribonacciResult = Arrays.copyOf(s, n);

        for (int i = 3; i < n; i++)
            tribonacciResult[i] = tribonacciResult[i - 1] + tribonacciResult[i - 2] + tribonacciResult[i - 3];
        
            return tribonacciResult;
    }

}