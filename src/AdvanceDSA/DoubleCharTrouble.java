package AdvanceDSA;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class DoubleCharTrouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String A = "aaaaa";
		Deque<Character> stack
		= new ArrayDeque<Character>();
		stack.push(A.charAt(0));
		for(int i =1; i< A.length() ; i++) {
			char x = A.charAt(i);
			
			if(stack.isEmpty() == false) {
				char y =stack.pop();
			if(y == x) {
				continue;
			}
			

			else {
				stack.push(y);
				stack.push(x);
			}
			}
			else {
				stack.push(x);
			}


		}
		
		
		String B = (stack.stream().map(a -> a.toString()).collect(Collectors.joining("")));
		
		String C = new StringBuilder(B).reverse().toString();
		
		System.out.println(C);
		
		
		
		
	}

}
