package sortingandsearching;

public class SecondMaxNum {
    public static void main(String[]args){
        int a[]={455,18,235,21,33,27};
        int max1=a[0],max2=a[1];
        if(max2>max1)
        {
            max1=a[1];
            max2=a[0];
        }
        for(int i=2;i<=a.length-1;i++)
        {
            if(a[i]<=max2)
                continue;
            if(a[i]>=max1)
            {
                max2=max1;
                max1=a[i];
                continue;
            }
            max2=a[i];
        }
        System.out.println(max1);
        System.out.println(max2);

    }
}
