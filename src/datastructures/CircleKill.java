package datastructures;

import java.util.ArrayList;

public class CircleKill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> num = new ArrayList<>();
		
		
		for(int i =1 ; i< 101 ; i++) {
			num.add(i);
		}
		
		for(int i =0 ; i< 100 ; i++) {
			if(num.size() > i) {
				num.remove(i+1);
			}
			
		}
		
		for(int i =-1 ; i< num.size()-1 ; i++) {
			if(num.size() > i) {
				num.remove(i+1);
			}
			System.out.println(i);
		}
		

		
		System.out.println(num.size());
		
	}

}
