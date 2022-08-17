package sortingandsearching;

public class SecondMinValue {
    public static void main(String[]args){
        int a[]={12,34,13,14,24,36,45};
        int min1=a[0],min2=a[1];
        if(min2<min1)
        {
            min1=a[1];
            min2=a[0];
        }
        for(int i=2;i<a.length-1;i++)
        {
            if(a[i]>min2)
                continue;
            if(a[i]>min1)
            {
                min2=min1;
                min2=a[i];
                continue;
            }
            min1=a[i];

        }
        System.out.println(min2);
        System.out.println(min1);
    }
}
