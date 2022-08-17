package basicsprograms;

import java.util.Scanner;

public class TriangleProgram {
    public static void main(String[] args) {
        int a, b, c;
        Scanner Scanner = new Scanner(System.in);
        a = Scanner.nextInt();
        b = Scanner.nextInt();
        c = Scanner.nextInt();
        //3 equal Equilateral, 2- equal Isosceles, 0-equal Scalene
        if(a==b && b==c )
            System.out.println("Equilateral");
        else if  ( a==b || a==c || b==c)
            System.out.println("Isosceles");
        else
            System.out.println("scalene");
    }
}
