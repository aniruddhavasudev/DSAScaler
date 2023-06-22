package AdvanceDSA;

import java.util.Stack;

public class paranthesisBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "(([]))()";
		
//	  s.charAt(0) == ( && s.charAt(1) ==)
	  
		
		char[] m = new char[s.length()];
		boolean l = true;
		
		for(int i=0; i<s.length(); i++) {
			m[i] = s.charAt(i);
//			System.out.println(m[i]);
		}
		
		int z = s.length() -1;
		for(int j =0; j<m.length ; j++) {
			if(m[j] == '(' && m[j+1] == ')') {
				j++;
				z--;
				continue;
			}
			else if(m[j] == '[' && m[j+1] == ']') {
				j++;
				z--;
				continue;
			}
			else if(m[j] == '{' && m[j+1] == '}') {
				j++;
				z--;
				continue;
			}
			else if(m[j] == '(' && s.charAt(z) == ')') {
				j++;
				z--;
				continue;
			}
			else if(m[j] == '[' && s.charAt(z) == ']') {
				j++;
				z--;
				continue;
			}
			else if(m[j] == '{' && s.charAt(z) == '}') {
				j++;
				z--;
				continue;
			}
		
			else {
				l = false;
				
				break;
			}
		}
		
		System.out.println(l);
	}

}
