package datastructures;

import java.util.ArrayList;
import java.util.HashSet;

public class subArrayZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Long> hs = new HashSet<>();

		//		A : [ 30, -30, 30, -30 ]
		ArrayList<Integer> A = new ArrayList<>();
		A.add(30);
		A.add(-30);
		A.add(30);
		A.add(-30);

		ArrayList<Integer> PS = new ArrayList<>();
		
		int sum =0;
		int count = 0;
		for(int i =0 ; i<A.size(); i++) {
			sum = sum + A.get(i);
			PS.add(sum);
		}
		System.out.println(PS);
		for(int j=1; j< PS.size() ; j++) {
			for(int k=j+1 ; k < PS.size() ; k++) {
				
				
				
				}
			}
		


		System.out.println(count);

	}

}
