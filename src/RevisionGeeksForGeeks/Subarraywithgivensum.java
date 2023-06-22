package RevisionGeeksForGeeks;

import java.util.ArrayList;

//TWO-POINTER METHOD*****************************************

public class Subarraywithgivensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {1, 2, 3, 4, 5, 6 ,7, 8, 9, 10};
		ArrayList<Integer> arr = new ArrayList<>();
		
		
		
		int s = 15;
		
		
		int [] PS = new int [A.length];
		int pref = 0;
		
		for(int i=0; i<A.length ; i++) {
			pref += A[i];
			PS[i] = pref;
		}
		
		
		 int left = 0, right = 0, sum = 0;
		 outerloop:
		    while (right < A.length) {
		        sum += A[right];
		        while (sum > s) {
		            sum -= A[left];
		            left++;
		        }
		        if (sum == s) {
		                arr.add(left);
		                arr.add(right);
		    
		            break outerloop;
		        }
		        right++;
		    }

		    
if(arr.size() >0) {
//	return arr;
}
else {
	arr.add(-1);
//	return arr;
}
		
	}

}
