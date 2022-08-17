package oops;

public class Result {
    int rollno, phyisce, chemisty, maths;
    String name;

    public Result(int r, int p, int c, int m, String n) {
        this.rollno = r;
        this.phyisce = p;
        this.chemisty = c;
        this.maths = m;
        this.name = n;
    }

    public String toString() {
        if (phyisce < 40 || chemisty < 40 || maths < 40)
            return String.format("name=%s,Rollno=%s,physics=%s,chemistry=%s,maths=%s,Result=%s", name, rollno, phyisce, chemisty, maths, "fail");
        else
            return String.format("name=%s,Rollno=%s,physics=%s,chemistry=%s,maths=%s,Result=%s", name, rollno, phyisce, chemisty, maths, "pass");
    }

    public static void main(String[] args) {
        Result r1 = new Result(101, 45, 78, 50, "bholu");
        Result r2 = new Result(101, 12, 78, 50, "raju");
        System.out.println(r1);
        System.out.println(r2);
    }
}
