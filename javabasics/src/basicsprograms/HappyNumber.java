package basicsprograms;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 456;
        String output="#" + n + "#";
        Scanner s=new Scanner(System.in);
while (true) {
    int sum = 0;
    while (n > 0) {
        int rem = n % 10;
        n = n / 10;
        sum = sum + rem * rem;
    }
    if (sum == 1) {
        System.out.println("happy number :" + sum);
        return;
    }
    String str="#" + sum + "#";
    if(output.contains(str))
    {
        System.out.println("Not Happy Number");
        return;
    }
    output=output + str;

    //System.out.println(output);

    //System.out.println(sum);
    n=sum;
    //s.next();
}
    }
}

