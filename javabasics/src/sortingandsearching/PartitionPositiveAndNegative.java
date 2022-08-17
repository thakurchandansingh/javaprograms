package sortingandsearching;

import java.util.Arrays;

public class PartitionPositiveAndNegative {
    //public static void main(String[] args) {
       /* int a[] = {1, 2, 3, 4, 5, -1, -3, -5, 8, 9, -2};
       for(int i=0;i<a.length-1;i++)
           if(a[i]<=0)
           {
               System.out.print(a[i]);
           }*/
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, -1, -3, -5, 8, 9, -2};
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
        //    System.out.println(Array.toString(a));
        }
    }
}
//if(a[i]!=a[i-1]);
