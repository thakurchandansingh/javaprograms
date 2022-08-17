package sortingandsearching;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {

        int a[] = {9, 3, 6, 1, 2, 5, 1, 0, 1, 4, 7, 9, 9, 2, 2, 8};
        System.out.println(Arrays.toString(a));
        int[] frequencies = new int[10];

        for (int i : a) {
            frequencies[i]++;
        }
        System.out.println(Arrays.toString(frequencies));
        for (int i = 1; i <= frequencies.length - 1; i++)
            frequencies[i] += frequencies[i - 1];
        System.out.println(Arrays.toString(frequencies));
        int[] b = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            int value = a[i];
            int pos = frequencies[value];
            frequencies[value]--;
            b[pos - 1] = value;

        }
        System.out.println(Arrays.toString(b));


    }

}

