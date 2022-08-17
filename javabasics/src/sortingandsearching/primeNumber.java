package sortingandsearching;

import java.util.Arrays;

public class primeNumber {
    /*
     * 36 = 1 X 36
     * 36 = 2 X 18
     * 36 = 3 X 12
     * 36 = 4 X 9
     * 36 = 6 X 6
     * 36 = 9 X 4
     * 36 = 12 X 3
     * 36 = 18 X 2
     * 36 = 36 X 1
     *
     *
     * 48 =1 X 48
     * 48= 2 X 24
     * 48= 3 X 16
     * 48= 4 X 12
     * 48= 6 X  8
     * 48= 8 X  6
     * 48= 12 X 4
     * 48= 16 X 3
     * 48= 24 X 2
     *  48=48 X 1
     * */
    /*public static boolean isPrime(int n) {
        int limit = (int) Math.sqrt(n);
        for (int i = 2; i <= limit; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] primes = new int[n];
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                primes[count] = i;
                count++;
            }
            i++;
        }
        System.out.println(Arrays.toString(primes));*/
   /* public static boolean isPrime(int n) {
        int limit = (int) Math.sqrt(n);
        for (int i = 2; i <= limit; i++)
            if (n % i == 0)
                return false;
        return true;
    }
    public static void main(String[]args){
        int n=12;
        int []prime=new int[n];
        int count=0;
        int i=2;
        while(count<n){
            if(isPrime(i)){
                prime[count]=i;
                count++;
            }
            i++;
        }
        System.out.print(Arrays.toString(prime));

    }*/
    public static void main(String[]args){
        int n=12;
        int[]prime=new int[n];

    }
}

