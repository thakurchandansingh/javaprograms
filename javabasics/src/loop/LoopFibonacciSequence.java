package loop;

public class LoopFibonacciSequence {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int n = 21;
        if (n == 0 || n == 1) {
            System.out.println("Fib number");
            return;
        }
        int c = a + b;
        while (c < n) {
            a = b;
            b = c;
            c = a + b;

        }
        if (c == n) {
            System.out.println("Fib number");
            return;
        }
        System.out.println("Not Fib number");

    }
}

