package AdvanceDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;

public class LuckyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hashtable<Integer, Integer> ht1 = new Hashtable<>();
		int [] B = new int[2];
		int c = 2;
		int n = 9;

		boolean prime[] = new boolean[n+1];
		for(int i=0;i<=n;i++) {
			prime[i] = true;
		}


		for(int p = 2; p*p <=n; p++)
		{
			// If prime[p] is not changed, then it is a prime
			if(prime[p] == true)
			{
				// Update all multiples of p
				for(int i = p*p; i <= n; i += p)

				{prime[i] = false;}
			}
		}

		// Print all prime numbers
		for(int i = 2; i <= n; i++)
		{
			if(prime[i] == true) {
				ht1.put(i, i);
			
			}
		}
		
		ArrayList<Integer> tmp = Collections.list(ht1.keys());
		Collections.sort(tmp);
		
		for (int K : tmp) {
            if(ht1.contains(n-ht1.get(K))){
                B[0] = ht1.get(K);
				B[1] = n-ht1.get(K);
				break;
			}}
        
		System.out.println(Arrays.toString(B));
    }
			
     
}
