package basicsprograms;

import java.util.Scanner;

public class LeapYears {
    public static void main(String[] args) {
        int year = 2020;
        Scanner sc = new Scanner(System.in);
        if (year % 400 == 0) {
            System.out.println(year + "is a leap year.");
        } else if (year % 100 == 0) {
            System.out.println(year + "is  not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println(year + "is a leap year.");
        } else {
            System.out.println(year + "is not a leap year.");
        }
    }
}/*
else if(((a*a)+(b*b))==(c*c) || ((a*a)+(c*c))==(b*b) || ((c*c)+(b*b))==(a*a))
        System. out. println("Right Triangle");
        if (a <= 0 || b <= 0 || c <= 0)
        System.out.println("InvalidInput");
        if(a >= (b+c) || c >= (b+a) || b >= (a+c) )
        System.out.println("Not a Triangle");
        if(a==b && b==c)
        System.out.println("Equilateral Triangle");
        else if(a!=b && b!=c && c!=a)
        System.out.println("Scalene Triangle");
        else if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a))
        System.out.println("Isosceles Triangle");
        */