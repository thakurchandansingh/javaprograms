package basicsprograms;

import java.util.Scanner;

public class QuadraticEquation
{
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("a,b,c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double d = Math.sqrt(b * b - 4 * a * c);
        /*double x1=(-b + d)/(2*a);
        double x2=(-b-d)/(2*a);
        System.out.println(x1);
        System.out.println(x2);*/
    }


    }
