package sortingandsearching;

import java.util.Arrays;

public class QuickSort {
    /*  public static void quickSort(int[] a,int left,int right)
      {
          int temp;
          if(left>=right)

              return;
              int pivot=a[left];
              int fp=left;
              for(int i=left+1;i<=right;i++)
          {
              if(a[i]>=pivot)
                  continue;
              fp++;
              temp=a[i];
              a[i]=a[fp];
              a[fp]=temp;
          }
              temp=a[left];
              a[left]=a[fp];
              a[fp]=temp;
              quickSort(a,left,fp-1);
              quickSort(a,fp+1,right);
      }
      public static void main(String[] args) {
          int a[] = {5, 3, 2, 7, 0, 21, 2, 0, 9};
          quickSort(a,0,a.length-1);
          System.out.println(Arrays.toString(a));
      }*/
    /*public static void quicksort(int a[], int left, int right) {
        int temp;
        if (left >= right)
            return;
        int pivat = a[left];
        int fp = left;
        for (int i = left + 1; i <= right; i++) {
            if (a[i] > pivat)
                continue;
            fp++;
            temp = a[i];
            a[i] = a[fp];
            a[fp] = temp;
            System.out.println(Arrays.toString(a));
        }
        temp = a[left];
        a[left] = a[fp];
        a[fp] = temp;

        System.out.print(Arrays.toString(a));

        quicksort(a, left, fp - 1);
        quicksort(a, fp + 1, right);

    }

    public static void main(String[] args) {
        int a[] = {5, 6, 1, 0, 8, 3, 9, 4, 8, 7};
        quicksort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }*/
    public static void qSort(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = a[left];
        int fp = left, t;
        for (int i = left + 1; i <= right; i++) {
            if (a[i] >= pivot) {
                continue;
            }//swip the statr ---------------------------------------
            fp++;
            t = a[i];
            a[i] = a[fp];
            a[fp] = t;
        }
        System.out.println(Arrays.toString(a));
        //swip int there stap--------------------------------------
        t = a[fp];
        a[fp] = a[left];
        a[left] = t;
        System.out.println(Arrays.toString(a) + "*");
        qSort(a, left, fp - 1);
        qSort(a, fp + 1, right);
    }

    public static void main(String[] args) {
        int[] a = {-300, 2, 4, 55, -67, 7};
       // System.out.println(Arrays.toString(a));
        qSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}