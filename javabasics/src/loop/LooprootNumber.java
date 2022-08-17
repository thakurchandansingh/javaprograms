package loop;

public class LooprootNumber {
    public static void main(String[]args){
        int n=25;
        double x1=2;
        double x2=n/x1;
        double error=0.000001;
        double diff= Math.abs( x1-x2);
        System.out.println("\t\t" + x1 + "\t\t" + x2);
        while (diff>error)
        {
            x1=(x1+x2)/2;
            x2=n/x1;
            diff= Math.abs( x1-x2);
            System.out.println("\t\t" + x1 + "\t\t" + x2);
        }
        System.out.println(x1);
    }
}
