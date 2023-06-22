package AdvanceDSA;

import java.util.HashMap;

public class CheckPalindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "yzfbzbyyrurquqf";
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i =0; i<A.length() ; i++) {
			if(hm.containsKey(A.charAt(i))) {
				hm.put(A.charAt(i), hm.get(A.charAt(i))+1);
			}
			else {
				hm.put(A.charAt(i), 1);
			}
		}
		
		System.out.println(hm);
		int count = 0;
		
		for(int i =0; i<A.length() ; i++) {
			if(hm.containsKey(A.charAt(i)) && hm.get(A.charAt(i)) % 2 ==0 ) {
				continue;
			}
			else if(count ==1) {
				
				break;
			}
			else {
				hm.put(A.charAt(i), hm.get(A.charAt(i))-1);
				count++;
			}
		}
		System.out.println(count);
	}
	
}

