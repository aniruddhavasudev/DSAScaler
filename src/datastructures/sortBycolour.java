package datastructures;

import java.util.ArrayList;
import java.util.HashMap;

public class sortBycolour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//		A = [0 1 2 0 1 2]

		ArrayList<Integer> A = new ArrayList<>();
		A.add(0);
		A.add(1);
		A.add(2);
		A.add(0);
		A.add(1);
		A.add(2);
		ArrayList<Integer> B = new ArrayList<>();
		

		HashMap<Integer, Integer> hm = new HashMap<>();
	 // fill the array
		
		for (int i = 0; i < A.size(); i++)   
		{ 
			if(A.get(i) ==0) {
				B.add(0);
			}
		}
		for (int i = 0; i < A.size(); i++)   
		{ 
			if(A.get(i) ==1) {
				B.add(1);
			}
		}
		for (int i = 0; i < A.size(); i++)   
		{ 
			if(A.get(i) ==2) {
				B.add(2);
			}
		}
		System.out.println(B);

	}

}
