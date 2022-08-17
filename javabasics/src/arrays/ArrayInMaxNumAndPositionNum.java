package arrays;

public class ArrayInMaxNumAndPositionNum {
    public static void main(String[] args) {
        int a[] = {7, 1,8, 9, 3,6,2,};
        int max = a[0];
        int min=a[0];
        int pos = -1;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];                    
                pos = i;
            }
            for( int j=0; j< a.length; j++)
            {
                if(min>a[j])
                {
                   min=a[j];
                }
            }

        }
        System.out.println("maximum element is" + max);
        System.out.println("maximum element is" + min);
        System.out.println("position element is" + pos);
    }
}
