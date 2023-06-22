package AdvanceDSA;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NearestSmallerElementStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A = {4, 5, 2, 10, 8};
		
		 Deque<Integer> stack
			= new ArrayDeque<Integer>();
		 
		 int [] B = new int[A.length];
		 
		 for(int i =0 ; i<A.length ; i++) {
			 while(!stack.isEmpty() && stack.getFirst() >= A[i]) {
				 stack.pop();
			 }
			 if(stack.isEmpty()) {
				 B[i] = -1;
			 }
			 else {
				 B[i] = stack.getFirst();
			 }
			 
			 stack.push(A[i]); 
		 }
		 
		 System.out.println(Arrays.toString(B));
		
	}

}
