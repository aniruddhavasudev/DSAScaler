package datastructures;

import java.util.ArrayList;
import java.util.Collections;

public class twicethenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> A =new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(3);
		A.add(1);
		
		Collections.sort(A);
		int num =0;
		
		for(int i =0; i<A.size() ;i++) {
			int count =1;
			if(i == 0){
				if(A.get(i) == A.get(i+1)) {
					count++;
				}
				else {
					num= A.get(i);
				}
			}
			else if(i == A.size()-1){
				if(A.get(i) == A.get(i-1)) {
					count++;
				}
				else {
					num= A.get(i);
				}
			}
			else {
				if(A.get(i) == A.get(i-1) && A.get(i) == A.get(i+1)) {
					count++;
				}
				else {
					num= A.get(i);
				}
			}
			
		}
		System.out.println(num);
		
		
	}

}
