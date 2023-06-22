package datastructures;

import java.util.ArrayList;
import java.util.HashSet;

public class commonprefixStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//		A = ["abab", "ab", "abcd"];

		ArrayList<String> A = new ArrayList<>();
		A.add("abcd");
		A.add("abde");
		A.add("abcf");

		StringBuilder sc = new StringBuilder();
		HashSet<String> z = new HashSet<>();

		for(int i =0; i<A.size(); i++) {
			int j=0;

//			while(j<A.get(i).length()) {
//				if(i+1 < A.size()) {
//					int count =0;
//					String B = A.get(i);
//					String C = A.get(i+1);
//					if(B.length() <= C.length()) {
//						char d = B.charAt(j) ;
//						char e = C.charAt(j);
//						if(d==e) {
//							String str = Character.toString(e);
//							count++;
//							z.add(str);
//
//							//					sc.append(str);
//						}
//					}
//				}
//				j++;
//			}
			int k=0;
			if(i+1 <A.size()) {
			while(k<A.get(i+1).length()) {
				if(i+1 < A.size()) {
					int count2 =0;
					String D = A.get(i);
					String H = A.get(i+1);
					if(D.length() >= H.length()) {
						char f = D.charAt(k) ;
						char g = H.charAt(k);
						
						if(f==g) {
							String str2 = Character.toString(f);
							count2++;
							z.add(str2);

							//					sc.append(str);
						}
					}
				}
				k++;
		}
			}
				
	}
		 String result = String.join("", z);
		System.out.println(result);
}}
