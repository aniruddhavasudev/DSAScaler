package AdvanceDSA;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LargestRectangleHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []  A = {6, 2, 5, 4, 5, 1, 6};
		
		int [] NSR = new int[A.length];
		
		int [] NSL = new int[A.length];
		 Deque<Integer> stack
			= new ArrayDeque<Integer>();
		
		
		 for(int i =0 ; i<A.length ; i++) {
			 while(!stack.isEmpty() && stack.getFirst() >= A[i]) {
				 stack.pop();
			 }
			 if(stack.isEmpty()) {
				 NSR[i] = -1;
			 }
			 else {
				 NSR[i] = stack.getFirst();
			 }
			 
			 stack.push(A[i]); 
		 }
		 
		 stack.clear();
		 
		 for(int j = A.length-1 ; j>=0  ; j--) {
			 while(!stack.isEmpty() && stack.getFirst() >= A[j]) {
				 stack.pop();
			 }
			 if(stack.isEmpty()) {
				 NSL[j] = -1;
			 }
			 else {
				 NSL[j] = stack.getFirst();
			 }
			 
			 stack.push(A[j]); 
		 }
		 
		 int width =1;
		 int height =1;
		 int Area =1;
		 
		 for(int k =0; k<A.length ; k++) {
			 
			 width = NSR[k] - NSL[k] -1;
			 height = A[k];
			 
			 Area = Math.max(Area, (width * height));
			
			 
		 }
		 
		 Queue<Node> q
         = new LinkedList<>();
		 
		 
		 
		 System.out.println(Area);
		 System.out.println(Arrays.toString(A));
		 System.out.println(Arrays.toString(NSR));
		 System.out.println(Arrays.toString(NSL));
	}

}
