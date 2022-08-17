package basicsprograms;

public class SmallDightNumber {
    public static void main(String[]args){
        int n=1234567890;
        int rem,min;
        min=9;
        while(n!=0) {
            rem = n % 10;
            if (rem < min)
                min = rem;

            n /= 10;
        }
        System.out.println(" the smallest digit is" + min);

    }
}
