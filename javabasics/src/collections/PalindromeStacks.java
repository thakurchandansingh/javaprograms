package collections;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeStacks {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        System.out.println("enter your number");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        char[] chars=("" + n).toCharArray();
        for(char ch:chars)
            stack.push(ch);
        for(char ch:chars)
        {
            char outch=stack.pop();
            if(ch!=outch)
            {
                System.out.println("Not Palindrome");
                return;
            }

        }
        System.out.println("Palindrome");

    }
}
