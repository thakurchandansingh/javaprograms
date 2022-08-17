package OOPS;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
    private int accountnumber, balance;
 private String name;
    private static int currentaccountno = 0;

    public BankAccount(int accountno) {
System.out.println("Enter Name");
        Scanner scanner=new Scanner(System.in);
        name=scanner.nextLine();
        System.out.println("Enter Balance");
        balance=Integer.parseInt( scanner.nextLine());
        accountnumber=accountno;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountnumber=" + accountnumber +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                '}';
    }
}
