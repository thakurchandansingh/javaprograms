package basicsprograms;

import java.util.Scanner;

public class FindMaxThreeNUM {
    public static void main(String[] args) {

        int a, b, c;
        Scanner s =new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        int max;
        if(a>=b && a>=c)
            max=a;
        else
            if(b>=c)
                max=b;
            else
                max=c;

        int min;
        if(a<=b && a<=c)
            min=a;
        else if (b<=a)
            min=b;
        else
            min=c;
        System.out.println(max);
        System.out.println(min);


    }
}