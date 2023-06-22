package AdvanceDSA;

import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluateExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String [] A =   {"4", "13", "5", "/", "+"};

		Deque<String> stack
		= new ArrayDeque<String>();
		int val = 1;
		for(int i = 0; i<A.length ; i++) {

			if(A[i].equals("*") || A[i].equals("/") || A[i].equals("+") || A[i].equals("-") ){
				int c=Integer.parseInt(stack.pop()); 
				int d=Integer.parseInt(stack.pop()); 
				
				if(A[i].equals("*")){
					val = d*c;
				} else if(A[i].equals("+")){
					val = d+c;
				}//etc
				else if(A[i].equals("/")){
					val = d/c;
				}
				else if(A[i].equals("-")){
					val = d-c;
				}
				String s=String.valueOf(val);
				
				stack.push(s);
			}
			
			else {
				
				stack.push(A[i]);
			}
		}
		
		System.out.println(val);

	}

}
