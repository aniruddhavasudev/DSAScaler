package AdvanceDSA;

import java.util.ArrayList;

public class makePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		String A = "babb";
		String A = "abbb";
		int count =0;

		if(IsPalindrome(A,count) == true) {
			System.out.println(0);
		}

		else {
			count = findcount(A);
			System.out.println(count);
			System.out.println(A);
			count = A.length()-count;
			
			System.out.println(count);
		}

	}


	public static boolean IsPalindrome(String A,int count) {
		
		int n = 0;

		if(A.length() ==1 && A.charAt(0) =='a'){

			System.out.println(0);
		}

		if(A.length() % 2 ==0 ) {
			n = A.length()/2;
		}

		else {
			n = A.length()/2 +1;
		}

		ArrayList<Character> Arr = new ArrayList<>();


		for(int i =0; i<=n; i++) {
			Arr.add(A.charAt(i));
		}

		int j =0;
		

		for(int i = A.length()-1; i>=n ; i--) {

			if(Arr.get(j) == A.charAt(i))
			{
				count++;
				j++;
			}
			else {
				
				j++;
			}

		}

		if(A.length() % 2 !=0 && count == n-1) {
			
			return true;
		}

		else if(A.length() % 2 ==0 && count == n){
			
			return true;
		}

		else {

		}
		return false;

	}
	
	public static int findcount(String A) {
		int count =0;
		int n = 0;

		if(A.length() ==1 && A.charAt(0) =='a'){

			System.out.println(0);
		}

		if(A.length() % 2 ==0 ) {
			n = A.length()/2;
		}

		else {
			n = A.length()/2 +1;
		}

		ArrayList<Character> Arr = new ArrayList<>();


		for(int i =0; i<=n; i++) {
			Arr.add(A.charAt(i));
		}

		int j =0;
		

		for(int i = A.length()-1; i>=n ; i--) {

			if(Arr.get(j) == A.charAt(i))
			{
				count++;
				j++;
			}
			else {
				
				j++;
			}

		}
		return count;
	}

}
