package datastructures;

import java.util.ArrayList;

public class rotate2times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> A = new ArrayList<>();
		ArrayList<Integer> C = new ArrayList<>();
		
		int B = 2;
		
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);
		C.addAll(A);
		
		System.out.println(C);
		
			
			for(int j =0 ; j <B ;  j++) {
				
				for(int i = 0 ; i < A.size() ; i++) {
					if(i == A.size()-1) {
				
					}
					C.set(i+1, A.get(i));
				}
				
			}
//			if(i < (A.size()-(B))) {
//				System.out.println(A.get(i));
//				System.out.println("*******************************");
//				C.set(i+B,A.get(i));
//				
//			}
//			else {
//				C.set(A.size()-(i), A.get(i));
//				System.out.println(A.get(i));
//			}
//			
//			else {
//				A.set(i, A.get(i));
//			}
			System.out.println(C);
		}
		
		
	}
	

