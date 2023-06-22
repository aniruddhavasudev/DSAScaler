package datastructures;

import java.util.ArrayList;

public class DivisibiltyRule3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(3);
		int sum =0;

	for(int i =0 ; i<A.size() ; i++) {
		sum = sum + A.get(i);
	}
		
		if(sum %3 ==0) {
			System.out.println(1);
		}
	}
	
	
//	Use double exp=1
//
//			0
//			AA
//			Anish AgarwalYour TA
//			9:54 AM
//			And multiply Aget(i) with exp
//
//			0
//			AA
//			Anish AgarwalYour TA
//			9:54 AM
//			Next do exp=exp*10

}
