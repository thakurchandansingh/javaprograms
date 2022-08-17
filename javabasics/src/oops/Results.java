package oops;

public class Results {
    int roll, physiscs, math;
    String name;

    public Results(int r, int p, int m, String n) {
        this.roll = r;
        this.physiscs = p;
        this.math = m;
        this.name = n;
    }

    public static void Results(int n,  String massage) {
        for (int i = 0; i <= 5; i++)
            System.out.println(massage);
    }

    public static void main(String[] args) {
       // printhello(0,"exit");
        //printhello( 0,"fill");
        //printhello( 0,"delect");
        //printhello( 0,"search");
        //printhello(0,"empity");

    }

}