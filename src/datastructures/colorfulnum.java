package datastructures;

import java.util.HashMap;
import java.util.Map;

public class colorfulnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		ArrayList<Integer> hm = new ArrayList<>();
		HashMap<Integer,Integer> hm = new HashMap<>();

		int number = 23; // = some int
		String N = Integer.toString(number);
		
		int oldf =1;
		int newf =1;
		
		for(int i =0; i< N.length() ; i++) {
			
			char d = N.charAt(i);
			String m = Character.toString(d); 
			int q = Integer.parseInt(m);
			if(hm.containsKey(q) == true) {
				oldf = hm.get(q);
				
				newf = oldf +1;
				hm.put(q, newf);
			}
			else{hm.put(q,1);}
			for(int j =i+1 ; j<N.length() ; j++) {
				char c = N.charAt(j);
				String s=Character.toString(c);
				
				int p = Integer.parseInt(s);
				q = q * p;
//				System.out.println(m);
				if(hm.containsKey(q) == true) {
					oldf = hm.get(q);
					newf = oldf +1;
					hm.put(q, newf);
				}
				else{hm.put(q,1);}
			}
		}
	

for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
    
    int value = entry.getValue();
    if(value >1) {
    	System.out.println(value);
    }

}
		


	}

}
