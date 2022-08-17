package sortingandsearching;

import java.util.Arrays;

public class QuickSortOne {
     public static void mergeSort(int[] a, int left, int right) {
        if (left >= right) {
            System.out.println("[" + a[left] + "]");
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(a, left, mid);
        mergeSort(a, mid + 1, right);
        int[] c = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (a[i] <= a[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = a[j];
                j++;
                k++;
            }
        }
        if (i <= mid) {
            for (; i <= mid; i++, k++)
                c[k] = a[i];
        } else {
            for (; j <= right; j++, k++)
                c[k] = a[j];

            System.out.println(Arrays.toString(c));
            for (i = left; i <= right; i++) {
                a[i] = c[i - left];
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {9, 6, 5, 8, 3, 0, 6, 1, 2};
        mergeSort(a, 0, a.length - 1);
        System.out.println("output="+Arrays.toString(a));
    }
}
