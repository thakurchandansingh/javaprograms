package sortingandsearching;

public class NthLargestNumberOfAnElement {
    public static void main(String[] args) {
        int a[] = {23, 12, 34, 45, 65, 11, 10, 9, 56, 7};
        int n = 1;
        for (int i =0; i <= a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

            if (i == n - 1) {
                System.out.print(n + "largest number is" + a[i]);
                System.out.print("--------------------");
            }
        }
        for (int i = 0; i <= a.length; i++)

            System.out.print(a[i] + "  ");

    }
}
