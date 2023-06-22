package AdvanceDSA;

public class SubArrayOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A = {1, 2, 3, 4, 5};
		
		  long M = 1000000007;
		  int all = 0;
		  
		  for(int i =0; i<A.length ; i++) {
			  int sum = 0;
			  
			  for(int j =i ;j<A.length ; j++) {
				  sum = sum | A[j];
				  all = all + sum;
				  all = (int) (all % M);
			  }
			 
			 
		  }
		  
		  System.out.println(all);
		
	}

}
