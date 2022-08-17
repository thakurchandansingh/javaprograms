package basicsprograms;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int p,r,t;
        System.out.println("Enter P,R and T");
        //System.out.println(7/2);
        //System.out.println(7.0/2);
        p=scanner.nextInt();
        r=scanner.nextInt();
        t=scanner.nextInt();
        double si=(p+r+t)/100;
        System.out.println(si);
    }
}
