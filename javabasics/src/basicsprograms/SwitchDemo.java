package basicsprograms;

import java.util.Scanner;

public class SwitchDemo {
    /*public static void main(String[] args) {
        int day = 1;
        switch (day) {
            case 0:
                System.out.println("Sun");
            case 1:
                System.out.println("Mon");
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("Wed");
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
            case 6:
                System.out.println("Sat");
            default:
                System.out.println("Invalid");

        }
}*/
    public static void main(String[] args) {

       /* int changetoword = 7;
        switch (changetoword ) {
            case 0:
                System.out.println("one");
                break;
            case 1:
                System.out.println("two");
                break;
            case 2:
                System.out.println("three");
                break;
            case 3:
                System.out.println("four");
                break;
            case 4:
                System.out.println("five");
                break;
            case 5:
                System.out.println("six");
                break;
            case 6:
                System.out.println("eight");
                break;
            case 7:
                System.out.println("nine");
                break;
        }*/

        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        switch (n % 2) {
            case 0:
                System.out.println("even num");
                break;
            default:
                System.out.println("odd num");
                break;
        }*/
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        n=1;
        switch(n++)
        {
            case 0:
            System.out.println("months of number");
            break;
            default :
                System.out.println();
        }
    }
}