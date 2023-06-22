package datastructures;

import java.util.ArrayList;

public class rotateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<ArrayList<Integer>> A = new ArrayList<>();
		ArrayList<ArrayList<Integer>> B = new ArrayList<>();
		
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(1);
		a1.add(2);
		A.add(a1);
		
		ArrayList<Integer> a2 = new ArrayList<>();
		a2.add(3);
		a2.add(4);
		A.add(a2);
		
		B.addAll(A);
		
		System.out.println(a1);
		System.out.println(a2);
		
		for(int i = 0; i< A.size() ; i++) {
			int index = 0;
			for(int j =0 ; j<A.get(i).size() ; j++) {
			
				index = j;
				if(index < A.get(i).size() -1) {
					System.out.println(B.get(i).get(j));
				A.get(i).set(index +1, B.get(i).get(j));}
				else if((index >= A.get(i).size() -1)  && A.size()-i == 1) {
					System.out.println(B.get(i).get(j));
					A.get(i).set(index-1, B.get(i).get(j));
				}
				
			}
		}
		
	}

}
