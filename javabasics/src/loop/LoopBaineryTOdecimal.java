package loop;

public class LoopBaineryTOdecimal {


    public static void main(String[] args) {
        int binarynumber=10010;
        int m=1;
        int decimal=0;
        while(binarynumber>0)
        {
            int rem=binarynumber % 10;
            binarynumber/=10;
            decimal=decimal + rem*m;
            m=m*2;
        }
        System.out.println(decimal);

    }
}
