package basicsprograms;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

       /* Scanner s = new Scanner(System.in);
        System.out.println("base,height");
        base = s.nextInt();
        height = s.nextInt();
        double area = (base * height) / 2.0;
        System.out.println(area);

        */
        int base, height;
        Scanner Scanner=new Scanner(System.in);
        base=Scanner.nextInt();
        height=Scanner.nextInt();
       double area=(base * height)/2;
       System.out.println(area);
    }
}
