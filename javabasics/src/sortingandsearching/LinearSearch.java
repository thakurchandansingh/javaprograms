package sortingandsearching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Scanner scanner = new Scanner(System.in);
        int Searchvalue;
        System.out.println("enter value to Search");
        Searchvalue = scanner.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == Searchvalue) {
                System.out.println("found at" + i);
                return;
            }
        }
        System.out.println("not found");

    }
}

