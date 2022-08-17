package arrays;

public class OctaToHexadecimalNumber {
    public static void main(String[] args) {
/*       int octa=13;
        int m=1;
        int decimal=0;
      while (octa>0)
      {
          int rem=octa % 10;
          octa/=10;
          decimal=decimal + rem*m;
          m=m*8;
      }
      System.out.println(decimal);*/
        int decimal=123;
        int m=1;
        int octa=0;
        while (decimal>0)
        {
            int rem=decimal % 8;
            decimal/=8;
            octa=octa + rem*m;
            m=m*10;
        }
        System.out.println(octa);
    }
}
 /*if (rem < 10) {
                hexadecimal = hexadecimal * (decimal + rem);
            } else {
                hexadecimal = decimal + rem;
                // octa = octa + (rem * m);
                m = m / 16;
            }*/