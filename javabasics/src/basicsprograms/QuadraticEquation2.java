package basicsprograms;

import java.util.Scanner;

public class QuadraticEquation2 {
    public static void main(String[] args) {
        /*int a, b, c;
        Scanner Scanner = new Scanner(System.in);
        a = Scanner.nextInt();
        b = Scanner.nextInt();
        c = Scanner.nextInt();
        double d = b * b - 4 * a * c;
        double x1=(-b+d)/(2*a);
        double x2=(-b-d)/(2*a);
        System.out.println(x1);
        System.out.println(x2);
       if(d<0)

        System.out.println("negative");
        else
        System.out.println("positive");

*/
        int a, b, c;
        Scanner Scanner = new Scanner(System.in);
        a = Scanner.nextInt();
        b = Scanner.nextInt();
        c = Scanner.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("No equation");
            return;
        }
        if (a == 0) {
            System.out.println("One root " + (-c / b));
            return;
        }
        double d = b * b - 4 * a * c;
        if (d >= 0) {
            d = Math.sqrt(d);
            double x1 = (-b + d) / (2 * a);
            double x2 = (-b - d) / (2 * a);
            System.out.println("X1=" + x1);
            System.out.println("X2=" + x2);
            return;
        }
        d = Math.sqrt(-d);
        double rp = -b / (2 * a);
        double ip = d / (2 * a);
        System.out.println("RP=" + rp);
        System.out.println("IP=" + ip);
    }
}
