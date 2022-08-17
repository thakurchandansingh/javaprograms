package oops;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        //ArrayList<BankAccount>accounts=remove ArrayList<>();
        //  ArrayList<BankAccount>accounts=serch ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Pick an option\n0-Exit, 1-New Account, 2-Remove, 3-Search, 4-All,5-AddmMoney,6-withdrawal,7-update");
            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 0:
                    return;
                case 1:
                    System.out.println("New Account");
                    BankAccount account = new BankAccount(accounts.size() + 1);
                    accounts.add(account);

                    break;
                case 2: {
                    System.out.println("enter your remove account number ");
                    int accountnumber = Integer.parseInt(scanner.nextLine());
                    boolean found = false;
                    for (BankAccount acc : accounts)
                        if (accountnumber == acc.getAccountNumber()) {
                            System.out.println(acc);
                            accounts.remove(acc);
                            found = true;
                            break;
                        }
                    if (!found)
                        System.out.println("Remove");
                }

                break;
                case 3: {
                    System.out.println("Enter your account number search ");
                    int accno = Integer.parseInt(scanner.nextLine());
                    boolean found = false;
                    for (BankAccount acc : accounts)
                        if (accno == acc.getAccountNumber()) {
                            System.out.println(acc);
                            found = true;
                            break;
                        }
                    if (!found)
                        System.out.println("Not found");
                }
                break;
                case 4:
                    System.out.println("All");
                    for (BankAccount acc : accounts)
                        System.out.println(acc);
                    break;
                case 5:
                    System.out.println("AddMoney");
                    System.out.println("Enter your account number search ");
                    int accno = Integer.parseInt(scanner.nextLine());
                    boolean found = false;
                    for (BankAccount acc : accounts)
                        if (accno == acc.getAccountNumber()) {
                            System.out.println(acc);
                            if (accno != 0 && accno != -0) {
                                System.out.println("");
                                acc.deposit();
                                System.out.println(acc);
                                found = true;
                                break;
                            }
                        }
                    if (!found)
                        System.out.println("Not found");
                    break;

                case 6:
                    System.out.println("withdrawal");
                    System.out.println("Enter your account number search ");
                    int accnumber = Integer.parseInt(scanner.nextLine());
                    boolean exit = false;
                    for (BankAccount acc : accounts)
                        if (accnumber == acc.getAccountNumber()) {
                            System.out.println(acc);
                            acc.withdrawal();
                            System.out.println(acc);
                            exit = true;
                            break;
                        }
                    if (!exit)
                        System.out.println("Not found");
                    break;
                case 7:
                    System.out.println("enter your update account number ");
               //     BankAccount account = new BankAccount(accounts.size() + 0);
                    int accountnumber = Integer.parseInt(scanner.nextLine());
                    boolean tide = false;
                    for (BankAccount acc : accounts)
                        if (accountnumber == acc.getAccountNumber()) {
                            System.out.println(acc);
                            accounts.remove(acc);
                            tide = true;
                            break;
                        }
                    if (!tide)
                        System.out.println("update");


            }

        }
    }
}
