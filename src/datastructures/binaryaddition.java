package datastructures;

import java.util.ArrayList;
import java.util.Collections;

public class binaryaddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> A = new ArrayList<>();
		A.add(3);
		A.add(2);
		A.add(1);
		A.add(3);
		   
//		    long sum = number0 + number1;
//		    System.out.println(sum);
		
		 Collections.sort(A);
		 System.out.println(A);
	     
	     
	    int Ans =0;
	     for(int i=0; i<A.size(); i++) {
	      if(A.get(i) == i) {
//	    	 return 1;
	      }
        
	     }
	   
		 
		 
		
	}

}
