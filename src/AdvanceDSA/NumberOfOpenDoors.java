package AdvanceDSA;

public class NumberOfOpenDoors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int A = 5;
		
		boolean prime[] = new boolean[A+1];
		for(int i=0;i<=A;i++) {
			prime[i] = true;
		}


		for(int p = 2; p <=A; p++)
		{
			// If prime[p] is not changed, then it is a prime
			if(prime[p] == true)
			{
				// Update all multiples of p
				for(int i = p; i <= A; i += p)

				{if(prime[i] == true) {
					prime[i] = false;
				}
				else {
					prime[i] = true;
				}
					
					
					}
			}
			
			else {
				for(int i = p; i <= A; i += p)

				{if(prime[i] == false) {
					prime[i] = true;
				}
				else {
					prime[i] = false;
				}}
			}
		}
		
		
		
      int count = 0;
		// Print all prime numbers
		for(int i = 2; i <= A; i++)
		{
			if(prime[i] == true) {
				count++;
			
			}
		
	}
		System.out.println(count+1);
		
	}

}
