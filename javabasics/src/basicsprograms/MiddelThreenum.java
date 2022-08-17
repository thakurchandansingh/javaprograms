package basicsprograms;
import java.util.Scanner;
public class MiddelThreenum {
    public static void main(String[]args){
        int a,b,c;
        /**
        a       b       c
        1       2       3
         2      1       3
         3      2       1
         1      3       2
         1      2       3
         2      3       1
         */
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int mid;
        if(a>=b && a<=c || a>=c && a<=b)
            mid=a;
        else
        if(b>=a && b<=c || b>=c && b<=a)
            mid=b;
        else
            mid=c;
        System.out.println(mid);
        }

    }

