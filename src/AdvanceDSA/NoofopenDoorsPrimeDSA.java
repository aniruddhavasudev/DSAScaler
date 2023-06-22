package AdvanceDSA;

import java.util.Arrays;

public class NoofopenDoorsPrimeDSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 10;
		int [] B = new int[A];
		Arrays.fill(B, 0);
		
		int count  =1;
		int open = 0;
		
		for(int i =1; i<=A ; i++) {
			for(int k =i; k<=A ; k++) {
//			System.out.println(Arrays.toString(B));
			if(k % count ==0) {
				if(B[k-1] == 0) {
				B[k-1] = 1;
			}
				else {
					B[k-1] =0;
				}
			}
			else {
				continue;
			}
			
			
		}
			count++;}
		
//		System.out.println(Arrays.toString(B));
		for(int j =1; j<=A ; j++) {
			if(B[j-1] ==1) {
				open++;
				
			}
			else {
				continue;
			}
			
		}
		System.out.println(open);
	}

}
