package datastructures;

import java.util.ArrayList;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> A = new ArrayList<>();
		A.add("abcdefgh");
		A.add("aefghijk");
		A.add("abcefgh");

		//		String [] A = {"abab", "ab", "abcd"};
		StringBuilder temp1 = new StringBuilder();
		StringBuilder temp2 = new StringBuilder();

		for(int i = 0 ; i<1 ; i++) {
			int len;
			String temp = temp1.toString();
			if(temp.length() ==0) {
				len = Math.min(A.get(i).length(), A.get(i+1).length());
			}
			else {
				len = Math.min(Math.min(A.get(i).length(), A.get(i+1).length()),temp1.length());}
			

			for(int j=0; j < len ; j++) {
				if(i+1 < A.size()) {
					char b = A.get(i).charAt(j);
					char c = A.get(i+1).charAt(j);
					if(c == b) {
						String d = Character.toString(c);
						temp1.append(d);
					}
				}
			}
		}

//		System.out.println(temp1);
		for(int i = 2 ; i<A.size() ; i++) {
			int len;
			String s = temp1.toString();
			if(temp1.length() == 0) {

				//			  return temp1;
				len =0;
			}
			else {
				
				len = Math.min(A.get(i).length(),s.length());
			}
			
			for(int j=0; j < len ; j++) {
				
					char b = A.get(i).charAt(j);
					char c = s.charAt(j);
					if(c == b) {
						String d = Character.toString(c);
						temp2.append(d);
					}
			}
			
			temp1.delete(0, temp1.length());
			String singleString = temp2.toString();
			temp1.append(singleString);
			temp2.delete(0, temp2.length());

		}


		System.out.println(temp1);
	}

}
