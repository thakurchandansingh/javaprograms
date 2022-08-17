package oops;

import java.util.Scanner;

public class BankAccount {
    private static int currentaccountno = 0;
    private int accountnumber, balance;
    private String name;

    public BankAccount(int accountno) {
        System.out.println("Enter Name");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Enter Balance");
        balance = Integer.parseInt(scanner.nextLine());
        accountnumber = accountno;
    }


    public static int getCurrentaccountno() {
        return currentaccountno;
    }

    public int getAccountNumber() {

        return accountnumber;
    }

    public int getBalance()
    {
        return balance;
    }

    public String getName() {

        return name;
    }

    public void deposit() {
System.out.println("Enter the amount to deposit");
Scanner scanner=new Scanner(System.in);
int amount=Integer.parseInt(scanner.nextLine());
balance+=amount;

    }
    public void withdrawal() {
        System.out.println("Enter the amount to withdrawal");
        Scanner scanner=new Scanner(System.in);
        int amount=Integer.parseInt(scanner.nextLine());
        balance-=amount;

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
