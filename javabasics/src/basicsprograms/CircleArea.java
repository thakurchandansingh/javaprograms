package basicsprograms;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        int  area;
        double circumference;
        Scanner s = new Scanner(System.in);
        System.out.println("a,area");
        area = s.nextInt();// PI*r*r
        double r = Math.sqrt(area / Math.PI);
        System.out.println(r);
        circumference=2*Math.PI*r;
        System.out.println(circumference);

    }
}
