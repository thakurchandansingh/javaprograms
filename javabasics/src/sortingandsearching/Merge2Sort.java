
package sortingandsearching;

import java.util.Arrays;

/**
 *
 * 3, 7   3,4,5,6,7  7-3 + 1
 */
public class Merge2Sort {

    /* public static void main(String[] args) {
        int[] a={10,6,7,5,8,2,3,4,1,9};
        System.out.println(Arrays.toString(a));
        mergeSort(a, 0, a.length-1);
        //System.out.println(Arrays.toString(a));
    }
    static void mergeSort(int[] a,int left,int right)
    {
        if(left>=right)
            return;
        int mid=(left + right)/2;
        System.out.println(left + "," + mid + "," + right);
        mergeSort(a, left, mid);
        mergeSort(a, mid+1, right);
        int i=left,j=mid + 1,k=0;
        int[] c=new int[right-left + 1];
        //*******Both arrays there***************************
        while(i<=mid && j<=right)
        {
            if(a[i]<a[j])
            {
                c[k]=a[i];
                i++;
                k++;
            }
            else
            {
                c[k]=a[j];
                k++;
                j++;
            }
        }
        //********One Array Finished*************************
        if(i<=mid)
        {
            for(;i<=mid;i++,k++)
                c[k]=a[i];
        }
        else
        {
            for(;j<=right;j++,k++)
                c[k]=a[j];
        }
        //************Transfer Back******************
        //******left - right =a, 0 to c.length-1
        for(i=0;i<=c.length-1;i++)
        {
            a[i + left]=c[i];
        }
    }*/
    public static void main(String[] args) {
        int[] a = {8, 7, 56, 13, 3, 9, 5, 1};
        //System.out.println(Arrays.toString(a));
        mergesort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static void mergesort(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergesort(a, right, mid);
        mergesort(a, mid + 1, left);
        int i = left, j = mid + 1, k = 0;
        int[] c = new int[right - left + 1];
        while (i <= mid && j <= right) {
            if (a[i] < a[j]) {
                c[k] = a[i];
                k++;
                i++;
            } else {
                c[k] = a[j];
                k++;
                j++;
            }
        }
        if (i < mid) {
            for (; i <= mid; i++)
                c[k] = a[i];
        } else {

            for (; j <= right; j++)
                c[k] = a[j];
        }
        System.out.println(Arrays.toString(c));
        for (i = 0; i <= c.length - 1; i++) {
            c[i - left] = a[i];
        }
    }
}
