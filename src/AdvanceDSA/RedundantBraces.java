package AdvanceDSA;

import java.util.ArrayDeque;
import java.util.Deque;

public class RedundantBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String A = "(a*b)+(b*(d+(a)))";
		Deque<Character> stack
		= new ArrayDeque<Character>();
		int countBraces = 0;
		int countOps = 0;
		
		for(int i = 0 ; i<A.length() ; i++) {
			char x = A.charAt(i);
			if (x == '(' || x == '[' || x == '{') {
				// Push the element in the stack
				stack.push(x);
				countBraces++;
				continue;
			}
			else if(x == '+' || x == '-' || x == '/' || x == '*') {
				countOps++;
				
			}

		}
		
		System.out.println(0);
		
		if(countBraces == countOps) {
			System.out.println(0);
		}
		else {
			System.out.println(1);
		}
	}

}
