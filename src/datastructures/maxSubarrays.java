package datastructures;

import java.util.ArrayList;

public class maxSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  ArrayList<Integer>D = new ArrayList<>();
		  D.add(2);
		  D.add(1);
		  D.add(3);
		  D.add(4);
		  D.add(5);
		  
		  int A = 5;
		  int B = 12;
		  int maxSum = 0;
		  int Max =0;
		  
		  for(int i =0 ; i< D.size() ; i++) {
//			  System.out.println(i);
			  for(int j = i ; j<D.size() ; j++) {
				  int m = D.get(j);
//				  int n = D.get(j+1);
//				  int p = D.get(j-1);
				 
				  
				   if( j < D.size()-1) {
					  System.out.println(D.get(j+1));
					  
				  if(D.get(j+1) > m) {
					  
				  if((maxSum + D.get(j)) <= B) {
				  maxSum = maxSum + D.get(j);
				 
			  }
				  }
				  else {
					  break;
				  }
		  }
				   else {
						 
						  if(D.get(j)> D.get(j-1)) {
							  if(maxSum <= B && (maxSum+ D.get(j)) <= B) {
								  maxSum = maxSum + D.get(j);
						  }
					  }}
			
			  }
				Max = Math.max(Max, maxSum);
				maxSum=0;}
		  
		  System.out.println(Max);
		  
	}
}
