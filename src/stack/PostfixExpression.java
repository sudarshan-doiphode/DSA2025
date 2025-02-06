package stack;

import java.util.Objects;
import java.util.Stack;

public class PostfixExpression {
    public static void main(String[] args) {
        String[] arr = {"1", "2", "+", "2", "*", "1", "-"};
        int result = calculatePostfixExpression(arr, arr.length);
        System.out.println(result);
    }

    static int calculatePostfixExpression(String[] arr, int n) {
        if (arr == null) return -1;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (!arr[i].equals("+") && !arr[i].equals("-") && !arr[i].equals("*") && !arr[i].equals("/")) {
                stack.push(Integer.parseInt(arr[i]));
            } else if (Objects.equals(arr[i], "+") && !stack.isEmpty()) {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first + second);
            } else if (Objects.equals(arr[i], "-") && !stack.isEmpty()) {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first - second);
            } else if (Objects.equals(arr[i], "*") && !stack.isEmpty()) {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first * second);
            } else if (Objects.equals(arr[i], "/") && !stack.isEmpty()) {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first / second);
            }
        }

        if (stack.isEmpty()) return -1;
        else return stack.pop();
    }
}
