package datastructures;

import java.util.ArrayList;

public class str2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Integer> A = new ArrayList<>();
	
	A.add(1);
	A.add(2);
	A.add(3);
	A.add(4);
	A.add(5);
	int count = 0;
	
	for(int i = 0; i<= A.size()-1; i++) {
		count = A.get(i);
		
		for(int j = 0 ; j< A.size()-1 ; j++) {
			if(i ==j) {
				break;
			}
			else {
				count = count + A.get(j);
				if(count ==0 ) {
					break;
				}
			}
		}
		
		
	}
	if(count >0 ) {
		System.out.println("0");
	}
	}

}
