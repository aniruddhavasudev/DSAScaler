package datastructures;

import java.util.ArrayList;

public class minordiagonalsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> A = new ArrayList<>();
		ArrayList<Integer> a1= new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		
		A.add(a1);
		ArrayList<Integer> a2= new ArrayList<>();
		a2.add(5);
		a2.add(6);
		a2.add(7);
		
		A.add(a2);
		ArrayList<Integer> a3= new ArrayList<>();
		a3.add(9);
		a3.add(2);
		a3.add(3);
		
		A.add(a3);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		  int sum =0;

	        for(int i =0; i<A.size() ; i++){
	            for(int j =A.get(i).size() -(i+1) ; j > A.get(i).size() -(i+2) ; j--){
	                sum = sum + A.get(i).get(j);
	            }
	        }
	        System.out.println(sum);
	}

}
