package AdvanceDSA;

public class ReversePairsSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] A = {2000000000, 2000000000, -2000000000};
		 int count =0;
		 
		 for(int i =0 ; i< A.length ; i++) {
			 for(int j = i +1 ; j<A.length  ; j++) {
				 long k = A[j];
				 long a = 2;
				 long l = A[i];
				 if(l >  a *k) {
					
					 count++;
					
				 }
			 }
		 }
		 
		 System.out.println(count);
	}

}
