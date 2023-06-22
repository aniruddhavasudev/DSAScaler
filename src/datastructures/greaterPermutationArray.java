package datastructures;

import java.util.ArrayList;

public class greaterPermutationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		//		 A = [1, 2, 3]

		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(3);

		//		first find idx 
		//		then find idn
		//		swap idx and idn
		int i = A.size() - 2;
		while (i >= 0 && A.get(i) >= A.get(i+1)) {
			i--; 

			if (i >= 0) { 
				int j = A.size() - 1; 
				 while (A.get(j) <= A.get(i)) j--; 
					swap(A, i, j);
			}
			reverse(A, i + 1, A.size() - 1); 
			}
	
		System.out.println(A);
		
	}


public static void swap(ArrayList<Integer> A , int i, int j) {
	int tmp = A.get(i);
	A.set(i, A.get(j));
	A.set(j, tmp);
}

public static void reverse(ArrayList<Integer> A , int i, int j) {
	while (i < j) swap(A, i++, j--);
}
}
