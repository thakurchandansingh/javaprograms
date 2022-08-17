package loop;

public class LoopChangeAGivenNumber {
    public static void main(String[] args) {
        int n = 1423;
        String output = "";
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            switch (rem) {
                case 0:
                    output = " Zero" + output;
                    break;
                case 1:
                    output = " One" + output;
                    break;
                case 2:
                    output = " Two" + output;
                    break;
                case 3:
                    output = " Three" + output;
                    break;
            }
        }
        System.out.print(output);

    }
}
