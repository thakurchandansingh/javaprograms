package arrays;

public class DecimalToOcta {
    public static void main(String[] args) {
        int decimal = 123;
        int m = 1;
        int octa = 0;
        while (decimal > 0) {
            int rem = decimal % 8;
            decimal /= 8;
            if (rem < 10) {
                octa = octa * (decimal + rem);
            } else {
                octa = octa + rem * m;
                m = m / 16;
            }
            System.out.println(octa);

        }
    }
}