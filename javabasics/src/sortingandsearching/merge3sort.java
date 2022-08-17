package sortingandsearching;

import java.util.Arrays;

public class merge3sort {
    /*public static void main(String[] args) {
        int[] a = {8, 5, 2, 9, 4, 7, 1};

        mergesort(a, 0, a.length - 1);
        System.out.println("output=" + Arrays.toString(a));

    }
    public static void mergesort(int []a,int left,int right) {
        if (left >= right) {
            return;
        }
        {
            int mid =(left+right)/2;
            mergesort(a,left,mid);
            mergesort(a,mid+1,right);
            int []c=new int[right-left+1];
            int i=left,j=mid + 1,k=0;
            while (i<=mid && j<=right){
                if(a[i]<=a[j]){
                    c[k]=a[i];
                    i++;
                    k++;
                }
                else{
                    c[k]=a[j];
                    j++;
                    k++;
                }
            }
            if(i<=mid){
                for(;i<=mid;i++,k++)
                    c[k]=a[i];
            }
            else{
                for(;j<=right;j++,k++)
                    c[k]=a[j];
            }
            System.out.println(Arrays.toString(c));
            for(i=left;i<=right;i++)
            {
                a[i]=c[i-left];
            }
        }
    }*/
    public static void main(String[]args){
        int[]a={-8,5,9,-7,12,56,73,-89};
        mergeshot(a ,0 ,a.length-1);
        System.out.println("input"+Arrays.toString(a));
    }
    public static void mergeshot(int []a,int left,int right){
        if(left>=right){
            return;
        }
        int mid=(left+right)/2;
        mergeshot(a,left,mid);
        mergeshot(a,mid+1,right);
        int i=left,j=mid+1,k=0;
        int []c=new int[right-left+1];
        while(i<=mid && j<=right)
        {
            if(a[i]<a[j])
            {
                c[k]=a[i];
                        i++;
                k++;
            }
            else {
                c[k]=a[j];
                j++;
                k++;
            }
        }
        if(i<=mid){
            for(;i<mid;i++)
                c[k]=a[i];
            }
        else {
            for(;j<=right;j++)
                c[k]=a[j];
        }
        System.out.println(Arrays.toString(c));
        for(i=left;i<right;i++)
        {
            a[i]=c[i-left];
        }
    }



}
