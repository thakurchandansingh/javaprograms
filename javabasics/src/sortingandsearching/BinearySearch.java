package sortingandsearching;

import java.util.Scanner;

public class BinearySearch {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner scanner = new Scanner(System.in);
        int searchvalue;
        System.out.println("Enter value to search");
        searchvalue = scanner.nextInt();
        int left = 0, right = a.length - 1;
        while (true) {
            int mid = (left + right) / 2;
            if (searchvalue == a[mid]) {
                System.out.println("Found at " + mid);
                return;
            }
            if (searchvalue < a[mid])
                right = mid - 1;
            else
                left = mid + 1;
            if (left > right) {
                System.out.println("Not found");
                return;

            }
        }
    }
}
