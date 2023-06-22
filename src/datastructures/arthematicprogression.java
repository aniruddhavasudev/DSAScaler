package datastructures;

import java.util.ArrayList;
import java.util.Collections;

public class arthematicprogression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		A = [3, 5, 1]
		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(3);
		A.add(5);
		A.add(1);
		
		ArrayList<Integer> B = new ArrayList<>();
		
		
		int a = 1; int d = 2; int  n = 3;
		
		for(int i =1 ; i< n+1 ; i++) {
			
			B.add(a+(i-1)*d);
		}
		
		Collections.sort(A);
		if (A.equals(B) == true) {
            System.out.println(" Array List are equal");
        }
	}

}
