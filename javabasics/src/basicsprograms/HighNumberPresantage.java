package basicsprograms;

import java.util.Scanner;

public class HighNumberPresantage {
    public static void main() {
        int Percent;
        Scanner Scanner = new Scanner(System.in);
        Percent = Scanner.nextInt();
        switch (Percent) {
            case 1:
                int percent = Scanner.nextInt();
                if (percent < 40)
                    System.out.println("Fail");


                else if (percent < 50)
                    System.out.println("third ");

                else if (percent < 60)
                    System.out.println("second");

                else
                    System.out.println("first");

        }

    }
}
