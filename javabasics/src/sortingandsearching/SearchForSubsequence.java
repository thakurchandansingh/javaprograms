package sortingandsearching;

import javax.swing.*;

public class SearchForSubsequence {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int b[] = {2, 3, 8};
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            // System.out.print(" " + a[i];
            if (a[i] == b[c])
                c++;
            if (c == b.length) {
                System.out.println("succ");
                break;
            }
        }
        System.out.println("unsucc");


    }

}