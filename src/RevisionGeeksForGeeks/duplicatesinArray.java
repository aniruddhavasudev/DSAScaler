package RevisionGeeksForGeeks;

import java.util.ArrayList;
import java.util.HashMap;

public class duplicatesinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,3,1,2,3};
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		ArrayList<Integer> A = new ArrayList<>();
		
		for(int i = 0; i < a.length ; i++) {
			if(hm.containsKey(a[i])){
				if(hm.get(a[i]) +1 == 2){
			        A.add(a[i]);
			    }
				A.add(a[i]);
			}
			else {
				hm.put(a[i], 1);
			}
		}
		
		System.out.println(A.toString());
	}

}
