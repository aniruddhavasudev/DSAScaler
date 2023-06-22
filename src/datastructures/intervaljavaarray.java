package datastructures;

import java.util.ArrayList;

public class intervaljavaarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<ArrayList<Integer>> x = new ArrayList<>();
		
		 
		 
	
		 int rows = 5;
		 int L =0;
		 int R =0;
		 
		 for (int line = 1; line <= rows; line++) {
	            int C = 1;
	            ArrayList<Integer> Aline = new ArrayList<>();
	            for (int i = 1; i <= line; i++) {
	 
	                // The first value in a line is always 1
	            	Aline.add(C);
	                System.out.print(C + " ");
	                C = C * (line - i) / i;
	            }
	            x.add(Aline);
	            System.out.println();
	        }
		 System.out.println(x);
	}

}
