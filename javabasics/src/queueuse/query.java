package queueuse;

import java.util.Scanner;

public class query {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(true) {
            System.out.println("pick on option\n0-Exit,1-stack.push,2-stack.pop,3-all,4-clear");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    return;
                case 2:
                    System.out.println("stack.push");
                {
                    System.out.println("Enter value of push");
                    int data = Integer.parseInt(scanner.nextLine());
                    //query.push(data);

                }
                case 3:
                    System.out.println(" ");
            }
        }
    }
}
