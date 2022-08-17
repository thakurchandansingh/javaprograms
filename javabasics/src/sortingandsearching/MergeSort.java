package sortingandsearching;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] a, int left, int right) {
        if (left >= right)
            return;
        int mid=(left + right)/2;
        System.out.println(left + "," + mid + "," + right);
        mergeSort(a, left, mid);
        mergeSort(a, mid+1, right);

    }

    public static void main(String[] args) {
        int a[] = {6, 4, 9, 5, 1, 8, 3, 7, 2};
        mergeSort(a, 0, a.length - 1);

    }

}
