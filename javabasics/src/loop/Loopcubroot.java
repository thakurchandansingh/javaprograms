package loop;

public class Loopcubroot {
    public static void main(String[]args){
        int n=28;
        double x1=2;
        double x2=n/(x1*x1);
        double error=0.00000001;
        double diff= Math.abs( x1-x2);
        System.out.println("\t\t" + x1 + "\t\t" + x2);
        while (diff>error)
        {
            x1=(x1+x2)/2;
            x2=n/(x1*x1);
            diff= Math.abs( x1-x2);
            System.out.println("\t\t" + x1 + "\t\t" + x2);
        }
        System.out.println(x1);
    }

}

/* int[] binaryNum = new int[1000];

        // counter for binary array
        int i = 0;
        while (n > 0)
        {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }

    // driver program
    public static void main (String[] args)
    {
        int n = 17;
          System.out.println("Decimal - " + n);
        System.out.print("Binary - ");
          decToBinary(n);
    }
}*/