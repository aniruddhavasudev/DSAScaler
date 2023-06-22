package datastructures;

import java.util.ArrayList;

public class spiralorderMatrixarrayInterviewbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		[ 1, 2, 3 ],
//		[ 4, 5, 6 ],
//		[ 7, 8, 9 ]
		
		int A =3;
		int len  =A;
		int i =0;
		int j=0;
		int num =1;
		System.out.println(num);
		num++;
		
		ArrayList<ArrayList<Integer>> C = new ArrayList<>();
		
		while(len > 0) {
			
			for(int k =1 ; k<len; k++ ) {
				System.out.println(num);
				C.get(i).add(num);
				num++;
				i++;
			}
			
			for(int k =1 ; k<len; k++ ) {
				System.out.println(num);
//				C.add(i).add(num);
				num++;
				j++;
			}
			
			for(int k =1 ; k<len; k++ ) {
				System.out.println(num);
				num++;
				i--;
			}
			
			for(int k =1 ; k<len; k++ ) {
				System.out.println(num);
				num++;
				j--;
			}
			
			
			len = len-2;
			i++;
			j++;
		}
		

	}

}
