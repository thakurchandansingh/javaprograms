package arrays;

public class ArrayInLinear {
    public static void main(String[] args) {
        int a[] = {7, 8, 9, 6, 5, 7, 3, 1, 2};
        int num = 5;
        int n = 0;
        int pos = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                n = 1;
                pos = 0;
                break;
            }
        }
        System.out.println("enter the value of leaner arrary" + a);
        System.out.println("your position  of leaner arrary" + pos);
    }
}


