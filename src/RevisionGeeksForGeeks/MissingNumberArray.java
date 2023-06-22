package RevisionGeeksForGeeks;

import java.util.Arrays;

public class MissingNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = {1,2,3,5};
		
		Arrays.sort(A);
		
		int n = A[0];
		for(int i = 1; i<A.length ; i++) {
			
			if(A[i] == n+1) {
				n = A[i];
			}
			else {
				System.out.println(n+1);
				break;
			}
		}
		
		System.out.println(n-1);
		
		
	}
}
