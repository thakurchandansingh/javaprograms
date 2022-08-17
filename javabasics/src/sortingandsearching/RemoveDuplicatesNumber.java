package sortingandsearching;

public class RemoveDuplicatesNumber {
    public static void main(String[]args){
        int a[]={1,2,2,3,3,4,4,5,6,7,7,9,8};
        System.out.print(a[0]);
        for(int i=1;i<a.length-1;i++)
            if(a[i]!=a[i-1])
            System.out.print(" "+a[i]);

    }
}

