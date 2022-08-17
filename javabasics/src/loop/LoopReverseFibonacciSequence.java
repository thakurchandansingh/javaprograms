package loop;

public class LoopReverseFibonacciSequence {
    public static void main(String[] args) {
        int a = 18, b = 5;
        System.out.print("8,5");
        int c=a-b;
     while (c>0)
     {
         System.out.print("," +c);
         a=b;
         b=c;
         c=a-b;
     }
        System.out.print("," + c);

    }
}