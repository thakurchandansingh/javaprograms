package sortingandsearching;

import java.util.Arrays;

public class RadixSort {
    public static void PrintArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print(" ");

    }


    public static void main(String[] args) {
        int a[] = {8, 9, 3, 2, 1};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        PrintArray(a);
    }
}
