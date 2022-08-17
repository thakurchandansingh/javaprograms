package JavaQuestion;

public class primeNumber {
    public static void main(String[] args) {
        int n = 500;
        outer:
        for (int i = 2; i <= n; i++) {
            int limit = (int) Math.sqrt(i);
            for (int j = 2; j <= limit; j++) {
                if (i % j == 0)
                    continue outer;
            }

            System.out.print(i + " ");
        }
    }
}
