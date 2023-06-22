package AdvanceDSA;

import java.util.ArrayList;

public class FlipArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "010";
		System.out.println(flip(A));
	}

	public static ArrayList<Integer> flip(String A){
		ArrayList<Integer> sc = new ArrayList<>();
		
		int L = 0;
		int R = 0;
		int maxOne = 0;
		for(int i =1; i<= Math.pow(A.length(), 2) ; i++){
			long num = Integer.parseInt(A);
			String s = "";
			if(i % A.length() ==0 ) {
				L++;
			}
			else {
				
				System.out.println(s);
			}

		}


		return sc;
	}


}
