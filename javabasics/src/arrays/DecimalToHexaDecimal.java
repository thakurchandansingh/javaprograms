package arrays;

public class DecimalToHexaDecimal {
    public static void main(String[] args) {
        int octa = 123;
        String output = "";
        int base = 16;
        while (octa > 0) {
            int rem = octa % base;
            octa = octa / base;
            if (rem <= 9) {
                output = rem + output;
                continue;
            }
            char ch = (char) ('A' + rem - 10);
            output = ch + output;
        }
        System.out.println(output);
    }


}
