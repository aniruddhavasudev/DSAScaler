package AdvanceDSA;

import java.util.ArrayList;

public class DistinctPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] A = {96, 98, 5, 41, 80};
		 int prod =1;
		 for(int i =0; i<A.length ; i++) {
			 
			 prod = prod * A[i];
			 
		 }
		 System.out.println(prod);
		ArrayList<Integer> ht1 = new ArrayList<>();
			int [] B = new int[2];
			int c = 2;
			int n = prod;

			boolean prime[] = new boolean[n+1];
			for(int i=0;i<=Math.sqrt(n);i++) {
				prime[i] = true;
			}


			for(int p = 2; p*p <=n; p++)
			{
				// If prime[p] is not changed, then it is a prime
				if(prime[p] == true)
				{
					// Update all multiples of p
					for(int i = p*p; i <= Math.sqrt(n); i += p)

					{prime[i] = false;}
				}
			}

			// Print all prime numbers
			for(int i = 2; i <= Math.sqrt(n); i++)
			{
				if(prime[i] == true) {
					ht1.add( i);
				
				}
			}
			

			int count =0;
			for (int K : ht1) {
	            if( prod % K ==0) {
	            	count++;
	            	
				}}
	        
			System.out.println(count);
		 
	}

}
