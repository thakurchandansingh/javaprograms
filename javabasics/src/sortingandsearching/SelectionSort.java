package sortingandsearching;

public class SelectionSort {
    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
    public static void main(String[]args){
        int a[]={8,9,3,2,1};
        for(int i=0;i<a.length;i++){
            int smallest=i;
            for(int j=i+1;j<a.length;i++)
            {
                if(a[smallest]>a[j]){
                    smallest=j;
                }
            }
            int temp=a[smallest];
            a[smallest]=a[i];
            a[i]=temp;

        }
        printArray(a);
    }
}
