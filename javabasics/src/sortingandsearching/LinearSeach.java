package sortingandsearching;

import java.util.Scanner;

public class LinearSeach {
    public static void main(String[]args){
        int []a={2,3,5,7,89,4,9,8};
        Scanner scanner=new Scanner(System.in);
        int seachvalue;
        System.out.println("enter your value to search");
        seachvalue=scanner.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==seachvalue){
                System.out.println("found at"+i);
                return;
            }
            {
                System.out.println("not found ");
            }
        }

    }
}
