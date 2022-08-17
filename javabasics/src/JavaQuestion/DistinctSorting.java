package JavaQuestion;

public class DistinctSorting {
    public static void main(String[]args){
        int []a={1,1,2,3,4,5,5,6,7,8,9,9,9,9};
        System.out.print(a[0]);
        for(int i=1;i<a.length-1;i++)
            if(a[i]!=a[i-1])
                System.out.print(" "+a[i]);
    }
}
