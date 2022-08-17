package basicsprograms;

import java.util.Scanner;

public class DivisionMathed {

    public static void main(String[] args) {
        int physics, chemistry, maths;

        Scanner sc = new Scanner(System.in);
        physics = sc.nextInt();
        chemistry = sc.nextInt();
        maths = sc.nextInt();
        double percent = (physics + chemistry + maths) / 3.0;
        System.out.println("Percent " + percent);
        if (percent < 40)
            System.out.println("Fail");
        else if (percent < 50)
            System.out.println("third ");
        else if (percent < 60)
            System.out.println("second");
        else
            System.out.println("first");


    }
}
