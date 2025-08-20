/*
1. Open brackets must be closed by the same type
2. Open brackets must be closed in the correct order
3. Every close bracket has a corresponding open bracket of the same type

Use a stack!
For each open bracket let's add them to the stack
When a closing bracket appears make sure that the latest item in the stack is corresponding to the closing bracket
Make sure the stack is empty at the end of the string list
*/


import java.util.HashMap;
import java.util.Stack;

public class Leet20 {
    public static void main(String args[])
    {




    }
    public boolean isValid(String s){
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else if (c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
