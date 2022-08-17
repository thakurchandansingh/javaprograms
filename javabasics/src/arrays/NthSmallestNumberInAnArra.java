package arrays;

import java.util.Arrays;

public class NthSmallestNumberInAnArra {
    public static void main(String[] args) {
        int a[]={7,8,9,3,2,1};
        for(int i=0;i<=a.length-1;i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.println();
        for(int i:a)
        {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println(Arrays.toString(a));
    }
}
