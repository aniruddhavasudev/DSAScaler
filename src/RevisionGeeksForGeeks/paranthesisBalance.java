package RevisionGeeksForGeeks;

import java.util.HashMap;

public class paranthesisBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String para = "{([])}";

		HashMap<Character,Integer> hm = new HashMap<>();
		
		hm.put('{', 0);
		

		int n = para.length()/2;
		
//		while(para.charAt(n) == '')

		
		System.out.println(para.charAt(n));
	}

}

