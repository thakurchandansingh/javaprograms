package basicsprograms;

public class PalindromeClass {
    public static void main(String[]args){
        int n=3213;
        int copy=n;
        int rev=0,rem;
        while(copy!=0)
        {
            rem=copy%10;
            rev=rev*10+rem;
            copy/=10;
        }
        if(n==rev)
        {
            System.out.println(n+" is Palindrome NUMBER");
        }
        else{
            System.out.println(n+" is not a Palindrome number");
        }


    }
}
