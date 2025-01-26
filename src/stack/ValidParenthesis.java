package stack;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s ="[])";
        char[] charArray = s.toCharArray();
        if(charArray.length==1 || (charArray[0]==')' || charArray[0]=='}' || charArray[0]==']')){
            System.out.println("Not valid parenthesis");
        }
        var stack = new Stack<Character>();
        for (int i = 0; i < charArray.length; i++) {
            if(stack.isEmpty()){
                if(charArray[i]=='{' || charArray[i]=='[' || charArray[i]=='('){
                    stack.push(charArray[i]);
                }
                if(charArray[i]==')' || charArray[i]=='}' || charArray[i]==']'){
                    System.out.println("invalid")
                    ;
                    return;
                }
            }
            else if(!stack.isEmpty() && (charArray[i]=='{' ||  charArray[i]=='[' || charArray[i]=='(')){
                stack.push(charArray[i]);
            }
            else if(!stack.isEmpty()){
                Character peek= stack.peek();
                if(charArray[i]=='}' && peek=='{'){
                    stack.pop();
                }
                else if(charArray[i]==']' && peek=='['){
                    stack.pop();
                }
                else if(charArray[i]==')' && peek=='('){
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()) System.out.println("valid");
        else System.out.println("invalid");
    }
}
