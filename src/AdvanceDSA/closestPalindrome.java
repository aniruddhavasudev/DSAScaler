package AdvanceDSA;

import java.util.ArrayList;

public class closestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A = "abbba";
		int n = 0;

		if(A.length() % 2 ==0 ) {
			n = A.length()/2;
		}

		else {
			n = A.length()/2 +1;
		}
		System.out.println(n);

		ArrayList<Character> Arr = new ArrayList<>();


		for(int i =0; i<=n; i++) {

			Arr.add(A.charAt(i));
		}
		int j =0;
		int count =0;
		for(int i = A.length()-1; i>=n ; i--) {
			System.out.println(A.charAt(i));
			if(Arr.get(j) == A.charAt(i))
			{
				
				j++;
			}
			else {
				count++;
				j++;
			}

		}

		if(A.length() % 2 !=0 && count == 0) {
			count =1;
		}


		System.out.println(count);

	}

}
