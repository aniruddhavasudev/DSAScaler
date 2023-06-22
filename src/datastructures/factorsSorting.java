package datastructures;

import java.util.ArrayList;
import java.util.HashMap;

public class factorsSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		A = [6, 8, 9] A : [ 36, 13, 13, 26, 37, 28, 27, 43, 7 ]

		ArrayList<Integer> A = new ArrayList<>();
		A.add(36);
		A.add(13);
		A.add(13);
		A.add(26);
		A.add(37);
		A.add(28);
		A.add(27);
		A.add(43);
		A.add(7);
		int[] B = new int[A.size()];
		int[] C = new int[A.size()];

		HashMap<Integer,Integer> hm = new HashMap<>();

		for(int i =0; i<A.size(); i++) {
			int count =0;
			for (int j=1;j<=A.get(i);j++) {
				if (A.get(i)%j==0) {
					count++;

				}
			}
			B[i] = A.get(i);
			C[i] = count;

		}


		

		for(int i =0 ; i<A.size() ; i++) {
			int temp =0;
			int temp2 =0;
			for (int j = i + 1; j < A.size(); j++)   {
				if (C[i] > C[j]) {
					temp = B[i];
					temp2 = C[i];
					B[i] = B[j];
					C[i] = C[j];
					B[j] = temp;
					C[j] =temp2;
				}
				else if(C[i] == C[j]) {
					if(B[i] < B[j]) {
						temp = B[i];
						temp2 = C[i];
						B[i] = B[j];
						C[i] = C[j];
						B[j] = temp;
						C[j] =temp2;
					}
				}

			}}
		

//		Collections.reverse(B);
		
		for(int k =0;k<A.size() ; k++) {
			System.out.println(B[k]  + "  "+ C[k]);
		}
//		System.out.println(B.toString());
//		System.out.println(C);

	}

}
