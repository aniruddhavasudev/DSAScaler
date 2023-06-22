package AdvanceDSA;

import java.util.ArrayList;

public class amxsubmarixsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		A = [
		//		        [1, 1, 1, 1, 1]
		//		        [2, 2, 2, 2, 2]
		//		        [3, 8, 6, 7, 3]
		//		        [4, 4, 4, 4, 4]
		//		        [5, 5, 5, 5, 5]
		//		     ]
		//		 B = 3

		int B = 3;
		ArrayList<ArrayList<Integer>> A = new ArrayList<>();
		ArrayList<Integer> C = new ArrayList<>();
		C.add(1);
		C.add(1);
		C.add(1);
		C.add(1);
		C.add(1);

		ArrayList<Integer> D = new ArrayList<>();
		D.add(2);
		D.add(2);
		D.add(2);
		D.add(2);
		D.add(2);

		ArrayList<Integer> E = new ArrayList<>();
		E.add(3);
		E.add(8);
		E.add(6);
		E.add(7);
		E.add(3);

		ArrayList<Integer> F = new ArrayList<>();
		F.add(4);
		F.add(4);
		F.add(4);
		F.add(4);
		F.add(4);

		ArrayList<Integer> G = new ArrayList<>();
		G.add(5);
		G.add(5);
		G.add(5);
		G.add(5);
		G.add(5);

		A.add(C);
		A.add(D);
		A.add(E);
		A.add(F);
		A.add(G);

		int r=0;
		int rows =0;
		int columns =0;
		int c=0;
		int count =0;
		int MainSum =Integer.MIN_VALUE;

		outerloop:
			for(int l =0; l<Integer.MAX_VALUE; l++) {
				if(c== A.get(0).size()-B+1 && rows == A.size() ) {
					break;
				}
				if(c == A.get(0).size()-B+1 ) {

					rows = rows +1;
					r=rows;
					c=0;
				}

				int Maxsum = 0;
				int sum = 0;
				for(int k =rows; k<rows+B ; k++) {
					sum = 0;
					int q =0;
					for(int j =c ; j<c+B && j<A.get(0).size(); j++) {


						sum = sum + A.get(r).get(j);
						q =j;

					}
					Maxsum = sum + Maxsum;


					if(r == A.size()-1 && c == A.get(0).size()-B) {
						break outerloop;
					}


					r++;
					//					System.out.println(r);
				}

				MainSum = Math.max(Maxsum, MainSum);
				c++;
				r=rows;
			}

		System.out.println(MainSum);


	}


}
