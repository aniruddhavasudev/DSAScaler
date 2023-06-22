package datastructures;

import java.util.ArrayList;

public class alteratingsubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		A = [1, 0, 1, 0, 1]

		ArrayList<String> A = new ArrayList<>();
		A.add("abcdefgh");
		A.add("aefghijk");
		A.add("abcefgh");
		//		A = ["abab", "ab", "abcd"];
		String m = null ;
		
		StringBuilder sd = new StringBuilder();
		ArrayList<String> D = new ArrayList<>();

		for(int i =0 ;i<A.size() ; i++) {
			StringBuilder sc = new StringBuilder();
			if(i+1 <A.size()) {
				String B = A.get(i);
				String C = A.get(i+1);
				

				int len = Math.min(B.length(), C.length());
				

				int count =0;
				if(B == A.get(0)) {
				for(int j =0; j<len ; j++ ) {

					if(B.charAt(j) == C.charAt(j)) {
						String s = Character.toString(B.charAt(j));
						sc.append(s);
					}
					
				}
				sd.append(sc);
				}
				
				
				 
				else{
					String E = sd.toString();
					 C = A.get(i+1);
					int minlen = Math.min(E.length(), C.length());
					for(int k =0; k <minlen ;k++) {
					if(E.charAt(k) == C.charAt(k)) {
						String s = Character.toString(E.charAt(k));
						sc.append(s);
					}
				}
					sd.append(sc);

			}
				
			}
			}
			
		System.out.println(sd);
	}
	}

