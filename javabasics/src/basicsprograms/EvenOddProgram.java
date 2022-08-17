package basicsprograms;

import java.util.Scanner;

public class EvenOddProgram {
    public static void main(String[]args)
    {
        int a;
        Scanner sc =new Scanner(System.in);
        a=sc.nextInt();

        if(a%2==0)
        System.out.println("enter your even num");
        else
        System.out.println("enter your odd num");



    }
}
