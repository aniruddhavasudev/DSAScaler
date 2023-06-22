package datastructures;

import java.util.ArrayList;
import java.util.Collections;

public class str3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> A = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		A.add(5);
		A.add(17);
		A.add(100);
		A.add(1);
		
		for(int i = 0 ; i <= A.size()-1; i++) {
			if(A.get(i) % 2 ==0) {
				even.add(A.get(i));
			}
			else {
				odd.add(A.get(i));
			}
			
		}
		
		
		Collections.sort(even);
		Collections.sort(odd);
		System.out.println(even);
		System.out.println(odd);
		
		int diff = even.get(even.size()-1) -  odd.get(0);
		System.out.println(diff);
	}	
	}


