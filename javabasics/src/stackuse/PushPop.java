package stackuse;

import java.util.Scanner;
import java.util.Stack;

public class PushPop {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("pick on option\n0-Quit,1-stack.push,2-stack.pop,3-all,4-clear");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 0:
                    return;
                case 1:
                    System.out.println("stack.push");
                {
                    System.out.println("Enter value to push");
                    int data = Integer.parseInt(scanner.nextLine());
                    stack.push(data);
                }
                break;
                case 2:
                    System.out.println("stack.pop");
                    if (!stack.empty())
                        System.out.println(stack.pop());
                    break;
                case 3:
                    System.out.println("all");
                    System.out.println(stack);
                    break;
                case 4:
                    System.out.println("clear");
                    stack.clear();
                    break;
            }
        }
    }
}