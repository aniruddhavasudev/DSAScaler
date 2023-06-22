package RevisionGeeksForGeeks;

import java.util.Arrays;

public class MinimizetheHeight2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int K = 5;
		int N = 4;
		int Arr[] = {2,6,3,4,7,2,10,3,2,1};
		
		Arrays.sort(Arr);
		
		int A[] = new int[Arr.length];
		
		for(int i =0; i<Arr.length ; i++) {
			if(i == 0) {
				A[i] = Arr[i] + K;
			}
			else if(Arr[i]- K > 0) {
				A[i] = Arr[i] - K;
			}
			else {
				A[i] = Arr[i] + K;
			}
		}
		
		Arrays.sort(A);
		
		System.out.println(Arrays.toString(A));
		
		System.out.println(A[A.length-1] - A[0]);
	
	}

}
