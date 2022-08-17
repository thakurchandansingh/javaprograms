package oops;

public class Currency {
    int paisa;

    public Currency(int r, int p) {
        paisa = 100 * r + p;
    }

    public String toString() {
        int r = paisa / 100;
        int p = paisa % 100;
        return String.format("r%s.%s",r,p);
    }
    public static void main(String []args){
        Currency c1=new Currency(2,254);
        System.out.println(c1);
        Currency c2=new Currency(12,126);
        System.out.println(c2);
    }
}
