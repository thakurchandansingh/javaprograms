package basicsprograms;

import java.util.Scanner;

public class Currencyprogram {
    public static void main(String[] args) {
        int rupees, paisa;
        Scanner Scanner = new Scanner(System.in);
        rupees = Scanner.nextInt();
        paisa = Scanner.nextInt();
        int total = rupees * 100 + paisa;
        rupees = total / 100;
        paisa = total % 100;
        System.out.printf("Rs %s.%s", rupees, paisa);

    }
}
