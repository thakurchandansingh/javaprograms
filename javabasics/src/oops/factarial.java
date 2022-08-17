package oops;

public class factarial {
    public static int factarial(int n)
    {
        int  f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static  int combination (int n,int r)
    {
        return factarial(n)/(factarial(r)*factarial(n-r));
        // return factarial(n)/(factarial((r)))
    }
    public static void main(String[]args){
        System.out.println(combination(5,2));
        System.out.println(combination(5,5));
    }
}
