package datastructures;

import java.util.HashMap;

public class distinctstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A = "abcabbccd";
		int B = 3;
		
		HashMap<Character , Integer> sc = new HashMap<>();
		int oldv = 0;
		int newv = 0;
		
		for(int i =0; i<A.length() ; i++) {
			if(sc.containsKey(A.charAt(i)) == true) {
				oldv = sc.get(A.charAt(i));
				newv = oldv +1;
				sc.put(A.charAt(i), newv);
				
			}
			else {
				sc.put(A.charAt(i), 1);
			}
		}
 
		

	}

}
