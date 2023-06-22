package datastructures;

import java.util.ArrayList;

public class addSubarrayCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Integer>> A = new ArrayList<>();
		
		ArrayList<Integer> a1= new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		A.add(a1);
		ArrayList<Integer> a2= new ArrayList<>();
		a2.add(5);
		a2.add(6);
		a2.add(7);
		a2.add(8);
		A.add(a2);
		ArrayList<Integer> a3= new ArrayList<>();
		a3.add(9);
		a3.add(2);
		a3.add(3);
		a3.add(4);
		A.add(a3);
		
		System.out.println(A);
		
		ArrayList<Integer> temp = new ArrayList<>();
		
	
		int sum=0;
		for(int i = 0 ; i<A.size() ; i++) {
			for(int j =0 ; j<A.get(i).size()  ; j++) {
				if(temp.size() < A.get(i).size()) {
					temp.add(A.get(i).get(j));
				}
				else {
				sum = temp.get(j) + A.get(i).get(j) ;
				temp.set(j, sum);
			}}
		}
		System.out.println(temp);
	}

}
