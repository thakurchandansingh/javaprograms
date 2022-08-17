package OOPS;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Pick an option\n0-Exit, 1-New Account, 2-Remove, 3-Search, 4-All");
            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 0:
                    return;
                case 1:
                    System.out.println("New Account");
                    BankAccount account = new BankAccount(accounts.size() + 1);
                    accounts.add(account);
                    break;
                case 2:
                    System.out.println("Remove");
                    break;
                case 3:
                    System.out.println("Search ");
                    break;
                case 4:
                    System.out.println("All");
                    for (BankAccount acc : accounts)
                        System.out.println(acc);
                    break;
            }
        }
    }
}
