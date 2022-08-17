package basicsprograms;

import javax.swing.*;
import java.util.Scanner;

public interface HowMonthsInTheDate {
    public static void main(String[] args) {
        int months;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter month");
        months = Scanner.nextInt();
        switch (months) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(" in this months of 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("in this months of 30 days");
                break;
            case 2:
                System.out.println("Enter the year");
                int year = Scanner.nextInt();
                if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
                    System.out.println("29");
                else
                    System.out.println("28");


                break;
            default:
                System.out.println("invalid");
                break;

        }

    }
}
