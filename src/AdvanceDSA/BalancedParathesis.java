package AdvanceDSA;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParathesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String expr = "([{}])";
		Deque<Character> stack
        = new ArrayDeque<Character>();

    // Traversing the Expression
    for (int i = 0; i < expr.length(); i++) {
        char x = expr.charAt(i);

        if (x == '(' || x == '[' || x == '{') {
            // Push the element in the stack
            stack.push(x);
            continue;
        }

        // If current character is not opening
        // bracket, then it must be closing. So stack
        // cannot be empty at this point.
        if (stack.isEmpty())
            System.out.println("False");
        char check;
        switch (x) {
        case ')':
            check = stack.pop();
            if (check == '{' || check == '[')
            	 System.out.println("False");
            break;

        case '}':
            check = stack.pop();
            if (check == '(' || check == '[')
            	 System.out.println("False");
            break;

        case ']':
            check = stack.pop();
            if (check == '(' || check == '{')
            	 System.out.println("False");
            break;
        }
    }

    // Check Empty Stack
    System.out.println((stack.isEmpty())); 
		
	}

}
