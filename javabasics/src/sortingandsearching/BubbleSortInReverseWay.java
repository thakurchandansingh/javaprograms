package sortingandsearching;

import java.util.Arrays;

public class BubbleSortInReverseWay {
    public static void main(String[] args) {
        int a[] = {12, 3, 7, 90, 45, 34, 23, 98, 7, 1};
        System.out.println(Arrays.toString(a));
        int n = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            if (i == n - 1) {
                System.out.println(n+"reverse order is" + a[i]);
                System.out.println(Arrays.toString(a));
            }
        }
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");


    }
}
