package basicsprograms;

import java.util.Scanner;

public class SwitchProgramLeapYear {
    public static void main(String[] args) {
        int years;
        Scanner Scanner = new Scanner(System.in);
        years = Scanner.nextInt();
        switch (years % 400) {
            case 0:
                System.out.println("its  a leap years");
                break;
            default:
                switch (years % 4) {
                    default:
                        System.out.println("Not a leap year");
                        break;
                    case 0:
                        switch (years % 100) {
                            case 0:
                                System.out.println("Not leap  year");
                                break;
                            default:
                                System.out.println("Leap year");
                                break;
                        }
                        break;
                }
        }
    }
}
