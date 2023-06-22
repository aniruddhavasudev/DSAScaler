package datastructures;

import java.util.ArrayList;
import java.util.Collections;

public class ElementsRemovalSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		
		Collections.sort(A);
		int sum =0;
		for(int i = A.size()-1 ; i>=0 ; i--) {
			
			for(int j = i ; j>=0; j--) {
				sum = sum + A.get(j);
				
			}
			A.remove(i);
		}
	
		System.out.println(sum);

	}

}
