package datastructures;

import java.util.ArrayList;

public class goodSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		A = [1, 2, 3, 4, 5]
		int B = 4;
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);
		
		ArrayList<Integer> PS = new ArrayList<>();
		int sum = 0;
		for(int i =0; i<A.size() ; i++) {
			sum = sum + A.get(i);
			PS.add(sum);
		}
		
		System.out.println(PS);
		int Ans =0;
		int count =0;
	for(int L = 0 ; L < A.size(); L++) {
			for(int R =L ; R <A.size() ; R++) {
				if(PS.get(R)- PS.get(L-1) < B && (R-L) % 2 ==0){
					count++;
					System.out.println(PS.get(R));
				}
				else if((R+1) % 2 !=0 && PS.get(R) >B) {
					count++;
					System.out.println(PS.get(R));
				}}
			
			System.out.println(count);
		
	}
	}
}
