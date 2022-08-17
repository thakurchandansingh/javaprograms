package basicsprograms;

import java.util.Scanner;

public class TimeProgram {
    public static void main(String[] args) {
        int minutes, hours;
        Scanner Scanner = new Scanner(System.in);
        hours = Scanner.nextInt();
        minutes = Scanner.nextInt();
        if(hours<=11)
            ;
        else if(hours==12)
            ;
        else {
            System.out.printf("%s:%s PM\n",hours-12,minutes);
        }
        /*
        11:45 11:45 AM
        12:45 12:45 PM
        13:45 1:45 PM


         */


    }
}
