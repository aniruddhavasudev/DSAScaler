package datastructures;

import java.util.ArrayList;

public class InterestingArrayBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		A = [9, 17]
		ArrayList<Integer> A = new ArrayList<>();
		A.add(9);
		A.add(17);
	
	if(A.size() >1) {
		int res =0;
		for(int i=0; i<A.size() ;i++) {
			res = res ^ A.get(i);
		}
	   int res2 = res/2;
	   
	   if(res -res2 == res2) {
		   System.out.println("yes");
	   }
	   else {
		   System.out.println("No");
	   }
	   
	}
	else {
		 int res = A.get(0)/2;
		 if(res -A.get(0) == res) {
			   System.out.println("yes");
		   }
		   else {
			   System.out.println("No");
		   }
	}

}
	
}
