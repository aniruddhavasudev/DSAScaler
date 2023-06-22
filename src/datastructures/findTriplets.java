package datastructures;

import java.util.ArrayList;

public class findTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> A = new ArrayList<>();
		A.add(100);
		A.add(101);
		A.add(100);
		
		ArrayList<Integer> B = new ArrayList<>();
		B.add(2);
		B.add(4);
		B.add(5);
		
		
	 	
			double min = Double.POSITIVE_INFINITY;
		
			for(int i =0; i<A.size() ; i++) {
			 double L = Double.POSITIVE_INFINITY;
			 double R = Double.POSITIVE_INFINITY;
				for(int j = i-1 ; j >=0 ; j--) {
					if(A.get(j) < A.get(i)) {
						L = Math.min(L, B.get(j));
//						System.out.println(L);
					}
				}
				
				for(int k = i+1 ; k <=A.size()-1 ; k++) {
					if(A.get(k) > A.get(i)) {
						R= Math.min(R, B.get(k));
//						System.out.println(R);
					}
				}
			
				
//				min = Math.min(min, L+R+B.get(i));
				System.out.println(min);
//				System.out.println("L" +L+ " R" +R +" i"+B.get(i));
			}

//			System.out.println((int)min);
			double z = Double.POSITIVE_INFINITY;
			z = z+2 +4;
			System.out.println(min);
 
	}
	    
	}


