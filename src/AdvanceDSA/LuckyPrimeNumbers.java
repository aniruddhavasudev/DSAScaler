package AdvanceDSA;

public class LuckyPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 8;
		
			
			int dig =0;
			 
			 
			 for(int j = 2; j<=A ; j++) {
				 int count =0;
				 int c = 2;
				
				 for (int i = 2; i <= Math.sqrt(j); i+= 2)
			        {
			            // While i divides n, print i and divide n
			            while (j%i == 0)
			            {
			                System.out.print(i + " ");
			                j /= i;
			            }
			        }
		        if(count ==2) {
		        	dig++;
		        }
			 }
		        System.out.println(dig);
				
	
			}
		
		

	}


