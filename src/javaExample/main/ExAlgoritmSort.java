package javaExample.main;

import java.util.Arrays;

import java.util.stream.IntStream;

public class ExAlgoritmSort {

    public static void main(String[] args) {

        int[] unSortedArray = IntStream.of(5, 4, 7, 3, 8, 1).toArray();
       
        long start  = System.nanoTime();
        System.out.println( Arrays.toString (insertSortStreem(unSortedArray)));
        System.out.println( System.nanoTime() - start + " insert Sort Streem" );

        start  = System.nanoTime();
        System.out.println( Arrays.toString (insertSort(unSortedArray)));
        System.out.println( System.nanoTime() - start + " insert Sort"  );

        start  = System.nanoTime();
        System.out.println( Arrays.toString (choiceSort(unSortedArray)));
        System.out.println( System.nanoTime() - start + " choice Sort");

        start  = System.nanoTime();
        System.out.println( Arrays.toString (bableSort(unSortedArray)));
        System.out.println( System.nanoTime() - start  + " bable Sort");

    }

    public static int[] insertSortStreem(int[] unSortedArray) {    
        if (unSortedArray == null)
            return null;

        int[] tmpUnSortedArray = Arrays.copyOf(unSortedArray, unSortedArray.length);

        IntStream.range(1, tmpUnSortedArray.length)
            .forEach(i -> IntStream.range(0, i)
                .forEach(j -> {
                    int temp = tmpUnSortedArray[i];
                    tmpUnSortedArray[i] = temp < tmpUnSortedArray[j] ? tmpUnSortedArray[j] : temp;
                    tmpUnSortedArray[j] = temp > tmpUnSortedArray[j] ? tmpUnSortedArray[j] : temp;
            }));

            

        return tmpUnSortedArray;

    }

    public static int[] insertSort(int[] unSortedArray) {
        if (unSortedArray == null)
            return null;

        int[] tmpUnSortedArray = Arrays.copyOf(unSortedArray, unSortedArray.length);

        for (int i = 1; i < tmpUnSortedArray.length; i++) {

            for (int j = 0; j < i; j++) {
                if (tmpUnSortedArray[j] > tmpUnSortedArray[i]) {
                    int temp = tmpUnSortedArray[i];
                    tmpUnSortedArray[i] = tmpUnSortedArray[j];
                    tmpUnSortedArray[j] = temp;
                }
            }
        }
        return tmpUnSortedArray;
    }

    public static int[] choiceSort(int[] unSortedArray) {
        if (unSortedArray == null)
            return null;

        int[] tmpUnSortedArray = Arrays.copyOf(unSortedArray, unSortedArray.length);

        for (int i = 0; i < tmpUnSortedArray.length - 1; i++) {

            int first = tmpUnSortedArray[i];
            int second = tmpUnSortedArray[i + 1];

            for (int j = i + 2; j < tmpUnSortedArray.length; j++) {
                if (second > tmpUnSortedArray[j]) {
                    int tmp = second;
                    second = tmpUnSortedArray[j];
                    tmpUnSortedArray[j] = tmp;
                }
            }

            if (first > second) {
                int tmp = first;
                first = second;
                second = tmp;
            }
            tmpUnSortedArray[i] = first;
            tmpUnSortedArray[i + 1] = second;

        }
        return tmpUnSortedArray;

    }

    public static int[] bableSort(int[] unSortedArray) {

        if (unSortedArray == null)
            return null;

        boolean isLastProhod = true;

        int[] tmpUnSortedArray = Arrays.copyOf(unSortedArray, unSortedArray.length);
        int j = 0;

        do {
            isLastProhod = true;
            for (int i = 0; i < tmpUnSortedArray.length - 1; i++)
                if (tmpUnSortedArray[i] > tmpUnSortedArray[i + 1]) {
                    int temp = tmpUnSortedArray[i];
                    tmpUnSortedArray[i] = tmpUnSortedArray[i + 1];
                    tmpUnSortedArray[i + 1] = temp;
                    isLastProhod = false;
                    j++;
                }
        } while (!isLastProhod);
        System.out.println(j);

        return tmpUnSortedArray;

    }

}