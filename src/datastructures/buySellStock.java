package datastructures;

import java.util.ArrayList;

public class buySellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(4);
		A.add(5);
		A.add(2);
		A.add(4);

		int max = 0;
		int min = Integer.MAX_VALUE;
		int indexmax = 0;
		int indexmin = 0;
		int result = 0;
		if( A.size() == 0){
		  System.out.println("0");
		}
		else {
			for(int i =0 ; i< A.size()-1 ; i++) {
				for(int j = i+1; j < A.size() ; j++) {
					if(max < A.get(j) - A.get(i)) {
					max = A.get(j) - A.get(i);
					}
				}
			}
			System.out.println(max);
			
		}


	}

}
