package AdvanceDSA;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DistinctPairs2pointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A  = { 8, 5, 1, 10, 5, 9, 9, 3, 5, 6, 6, 2, 8, 2, 2, 6, 3, 8, 7, 2, 5, 3, 4, 3, 3, 2, 7, 9, 6, 8, 7, 2, 9, 10, 3, 8, 10, 6, 5, 4, 2, 3};
		int B = 3 ;
		int count =0;
		Set<ArrayList<Integer>> Set = new HashSet<>();
		int k =0;
		
		
		
		// Iteration using enhanced for loop
		//			System.out.println(Arrays.toString(A));

		for(int i =0; i<A.length ; i++) {

			for(int j = i+1; j<A.length ; j++) {
				ArrayList<Integer> zz = new ArrayList<>();
				ArrayList<Integer> mk = new ArrayList<>();
				int diff =0;
				diff = Math.abs(A[i] - A[j]);
				mk.clear();
				zz.clear();
				//System.out.println(A[i]+ "  "+ A[j]);
				if(diff == B ) {
					
					mk.add(A[i]);
					mk.add(A[j]);
					zz.add(A[j]);
					zz.add(A[i]);
		
					if(Set.contains(mk) || Set.contains(zz)) {
						continue;
					}
					else {	
						
						Set.add(mk);
						Set.add(zz);
						
						count++;}

				}
				
			}
		}
		System.out.println(count);
	}


}
