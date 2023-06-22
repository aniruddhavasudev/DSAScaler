package datastructures;

public class countfact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int A = 1;
		
		int count = 0;
		double B = Math.sqrt(A);
		
		for(int i =1 ; i<= A ; i++){
			if( A%i == 0) {
				System.out.println(i);
			}
			
		}
	}

}
