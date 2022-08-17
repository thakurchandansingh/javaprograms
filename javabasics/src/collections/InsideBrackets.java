package collections;

import java.util.Scanner;
import java.util.Stack;

public class InsideBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Stack<Integer> stack = new Stack<>();
        String expression = "a+(b+(c-d)*{c+d})-u";
        expression = "{" + expression + "}";
        char[] chars = expression.toCharArray();
        for (int i = 0; i <= chars.length - 1; i++) {
            char ch = chars[i];
            if (ch == '{') {
                stack.push(i);
                continue;
            }
            if (ch == '}') {
                int position = stack.pop();
                System.out.println();
                for (int j = position; j <= i; j++)
                    System.out.print(chars[j]);
            }
        }
    }
}
