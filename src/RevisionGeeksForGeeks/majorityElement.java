package RevisionGeeksForGeeks;

import java.util.HashMap;
import java.util.Map;

public class majorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {3,1,3,3,2};
		int N = 5;

		HashMap<Integer,Integer> hm = new HashMap<>();

		int maxelement = Integer.MIN_VALUE;

		for(int j =0; j<N ; j++){
			if(hm.containsKey(a[j])){
				int e = hm.get(a[j]);
				hm.put(a[j],e+1);
			}
			else{
				hm.put(a[j],1);
			}
		}


		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			int value = entry.getValue();
			if(value > N/2) {
				maxelement = Math.max(maxelement, value);
			}
		}
		
		if(maxelement != Integer.MIN_VALUE) {
			
		}
		System.out.println(maxelement);

	}

}
