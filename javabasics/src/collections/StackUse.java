package collections;

import java.util.Stack;

public class StackUse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= 5; i++)
            stack.push(i);

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
