package datastructures;

import java.util.ArrayList;

public class SumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Integer>> B = new ArrayList<>();
		ArrayList<Integer> b1 = new ArrayList<>();
		b1.add(1);
		b1.add(4);
		
		ArrayList<Integer> b2 = new ArrayList<>();
		b2.add(2);
		b2.add(3);
		B.add(b1);
		B.add(b2);
		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);
		
		
		ArrayList<Integer> PS = new ArrayList<>();
		int sum =0;
		
		ArrayList<Integer> range = new ArrayList<>();
		int num = 0 ;
		
		for( int i=0 ; i < A.size() ; i++) {
			sum = sum + A.get(i);
			PS.add(sum);
		}
		
		
		for(int i = 0 ; i <B.size() ; i++) {
			int num1 = (B.get(i).get(0)) -1;
			int num2 = (B.get(i).get(1)) -1;
			
			if(num1 == 0) {
				num = 0;
			}
		}

	}

}
