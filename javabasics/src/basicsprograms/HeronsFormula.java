package basicsprograms;

import java.util.Scanner;

public class HeronsFormula {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("a,b,c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double s = (a + b + c) / 2.0;
        double area = s * (s - a) * (s - b) * (s - c);
        area = Math.sqrt(area);
        System.out.println(area);
    }
}
