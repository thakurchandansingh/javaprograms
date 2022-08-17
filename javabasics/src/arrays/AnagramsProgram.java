package arrays;

import java.util.Arrays;

public class AnagramsProgram {
    public static void main(String[]args){
        int a=1233444,b=313333342;
        int [] acount1=new int[10];
        int [] acount2=new int[10];
        while (a>0)
        {
            int rem=a%10;
            a/=10;
            acount1[rem]++;
        }
        while (b>0)
        {
            int rem=b%10;
            b/=10;
            acount2[rem]++;
        }
        System.out.println(Arrays.toString(acount1));
        System.out.println(Arrays.toString(acount2));
    }
}
