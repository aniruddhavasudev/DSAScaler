package AdvanceDSA;

import java.util.ArrayDeque;
import java.util.Deque;

public class checktwobrakcet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String A = "-(a+b+c)";
		 
		 Deque<Character> stack
			= new ArrayDeque<Character>();
		 
		 for(int i =0; i<A.length() ; i++) {
			 stack.push(A.charAt(i));
		 }
		 
		 int sum =1;
		 for(int j =0 ; j<stack.size() ; j++) {
			 if(A.charAt(j) != '(' || A.charAt(j)!= ')') {
			 if(A.charAt(j) == '-') {
					 
					 sum = sum * A.charAt(j);
		 }
		
	}

}
	}
}
