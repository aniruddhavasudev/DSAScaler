package datastructures;

import java.util.ArrayList;

public class LargestnumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		A = [3, 30, 34, 5, 9]
		ArrayList<Integer> A = new ArrayList<>();
		A.add(3);
		A.add(30);
		A.add(34);
		A.add(5);
		A.add(9);
		
		
		for(int i =0; i<A.size() ; i++) {
			int temp =0;
			String s=String.valueOf(A.get(i));
			
			for(int j =i ; j<A.size(); j++) {
				String t=String.valueOf(A.get(j));
				if(s.length() != t.length() ) {
					
					int len = Math.min(t.length(), s.length());
					
					for(int k =0; k<len ;k++) {
						if(s.charAt(k) == t.charAt(k)) {
							continue;
						}
						else {
//							s.charAt(k)
							break;
						}
					}
				}
				else {
				temp = A.get(i);
				A.set(i,A.get(j));
				A.set(j,temp);
				}
			}
		}
		
	}

}
