package datastructures;

import java.util.ArrayList;

public class Maximumpositivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(5);
		A.add(6);
		A.add(3);
		A.add(-7);
		A.add(8);
		
//		 A = [5, 6, -1, 7, 8]
		ArrayList<Integer> temp1 = new ArrayList<>();
		ArrayList<Integer> temp2 = new ArrayList<>();
		for(int i =0; i<A.size() ; i++) {
			
			for(int j =i; j<A.size(); j++) {
				
				if(A.get(j) > 0 ) {
					temp1.add(A.get(j));
				}
				else {
					break;
				}
			}
			if(temp1.size() > temp2.size()) {
				
				temp2.clear();
				temp2.addAll(temp1);
				temp1.clear();
			}
			
			else if(temp1.size() == temp2.size()) {
				temp1.clear();
			}
			
			else {
				temp1.clear();
			}
		}
		
		System.out.println(temp2);
		
	}

}
