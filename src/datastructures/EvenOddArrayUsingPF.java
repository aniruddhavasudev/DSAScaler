package datastructures;

import java.util.ArrayList;

public class EvenOddArrayUsingPF {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> A =new ArrayList<>();
		A.add(1);
		A.add(1);
		A.add(1);
		
		ArrayList<Integer> PSE =new ArrayList<>();
		ArrayList<Integer> PSO =new ArrayList<>();
		
		int pe = 0;
		int po = 0;
		
		for(int i =0 ; i<A.size() ; i++) {
			if(i % 2==0) {
				pe = pe +A.get(i);
				PSE.add(pe);
			}
			else {
				PSE.add(pe);
			}
		}
		
		for(int i =0 ; i<A.size() ; i++) {
			if(i % 2!=0) {
				po = po +A.get(i);
				PSO.add(po);
			}
			else {
				PSO.add(po);
			}
		}
		int count=0;
		for(int j =0 ; j <A.size() ; j++) {
			int so = 0;
			int se = 0;
			if(j==0) {
				so = 0 + PSE.get(A.size() -1) - PSE.get(j);
				se = 0 + PSO.get(A.size() -1) - PSO.get(j);
				if(so == se) {
					count++;
				}
			}
			else {
				so = PSO.get(j-1) + PSE.get(A.size() -1) - PSE.get(j);
				se = PSE.get(j-1) + PSO.get(A.size() -1) - PSO.get(j);
				if(so == se) {
					count++;
				}
			}
			
			
		}
		System.out.println(count);
	}
}
