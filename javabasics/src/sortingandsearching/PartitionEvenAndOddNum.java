package sortingandsearching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PartitionEvenAndOddNum {
    public static void main(String[]args){
        /*int n = 10;
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            if(n%2==0)
            {
                System.out.println("even num");
            }
        if(n%2!=0)
        System.out.println("odd num");*/
        int a[]={2,3,4,5,6,7,8,9,10,12,14,13,16,15,18};
        //int a[] = {1, 2, 3, 4, 5, -1, -3, -5, 8, 9, -2};
        int left = 0, right = a.length - 1;
        while (true) {
            while (left < right && a[left] >= 0) {
                left++;

            }
            if (left >= right)
                break;
            while (left < right && a[right] < 0) {
                right--;

            }
            if (left >= right)
                break;
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            System.out.println(Arrays.toString(a));
        }

    }
}

