package sortingandsearching;

import java.util.Arrays;

public class countSort {
    public static void main(String[] args) {
        int a[] = {1, 4, 1, 3, 4, 5, 6, 8, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1,};
        System.out.println(Arrays.toString(a));
        int[] fre = new int[10];
        for (int i : a) {
            fre[i]++;
        }
        System.out.println(Arrays.toString(fre));
        for (int i = 1; i <= fre.length - 1; i++)
            fre[i] += fre[i - 1];
        System.out.println(Arrays.toString(fre));
        int[] b = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            int value = a[i];
            int pos = fre[value];
            fre[value]--;
            b[pos - 1] = value;
        }
        System.out.println(Arrays.toString(b));
    }
}

/*
        for (int i = 1; i <= fre.length - 1; i++)
            fre[i] += fre[i - 1];
        System.out.println(Arrays.toString(fre));
        int[] b = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            int value = a[i];
            int pos = fre[value];
            fre[value]--;
            b[pos - 1] = value;
        }
        System.out.println(Arrays.toString(b));
    }
}*/
