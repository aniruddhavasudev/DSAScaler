package AdvanceDSA;

public class maxjumpindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {1, 2, 3, 4, 5};
		int count=0;
		for(int i = 0; i<A.length ; i++) {
			if(A[i] + i < A.length - i-1) {
				i = A[i]+i;
				count++;
			}
			else if(i < A.length-1) {
				for(int j =1 ; j<A.length ; j++) {
					if(A[i]-j == A.length-i-1) {
						count++;
					}
				}
			}
				
			}
			
		System.out.println(count);
		
		
	}

}
