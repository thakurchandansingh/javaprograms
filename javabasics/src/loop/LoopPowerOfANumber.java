package loop;

public class LoopPowerOfANumber {
    public static void main(String[] args) {
        int x = 2, y = 4;
        int prod = 1;
        for (int i = 1; i <= y; i++)
            prod *= x;
        System.out.println(prod);

    }
}
