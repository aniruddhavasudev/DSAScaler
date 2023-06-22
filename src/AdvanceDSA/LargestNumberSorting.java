package AdvanceDSA;

import java.util.ArrayList;
import java.util.Collections;

public class LargestNumberSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A = new ArrayList<>();
		A.add(3);
		A.add(30);
		A.add(34);
		A.add(5);
		A.add(9);
		
		Collections.sort(A);
		String Z = "";
		
		for(int i =0 ; i<A.size()-1 ;i++) {
			String X = String.valueOf(A.get(i));
			String Y = String.valueOf(A.get(i+1));
			
		 String XY = X + Y;
		 
		 
         // then append X at the end of Y
         String YX = Y + X;
         
         
         if(XY.compareTo(YX) >0) {
        	 Z =Z+XY;
         }
         else {
        	 Z =Z+YX;
         }

         // Now see which of the two
         // formed numbers
         // is greater
		}
		System.out.println(Z);
		
	}

}
