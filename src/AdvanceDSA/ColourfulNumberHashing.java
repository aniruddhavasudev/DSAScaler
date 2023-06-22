package AdvanceDSA;

import java.util.ArrayList;
import java.util.HashSet;

public class ColourfulNumberHashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 23;

		String B = String.valueOf(A);

		ArrayList<Integer> C = new ArrayList<>();

		for(int i = 0  ; i < B.length() ; i++) {
		 char ch = B.charAt(i); 
		 
		 int a = ch - '0';
		 C.add(a);
		 
	
		}
//		System.out.println(C);
		
		HashSet<Integer> hs= new HashSet<>();

		for(int j =0; j < C.size() ; j++) {
			int num = 0;
			int product = 1;
			for(int k =j ; k<C.size() ; k++) {
				String s1 = Integer.toString(num);
		        String s2 = Integer.toString(C.get(k));
		        
		        // Concatenate both strings
		        String s = s1 + s2;
		        num = Integer.parseInt(s);
		        
		        product = num * (C.get(k));
				
				System.out.println(num);
//				System.out.println(product);
				
				if(hs.contains(product)) {
					System.out.println("******");
				}
				
				hs.add(product);
				
			}
		}
		System.out.println(hs);

	}

}
