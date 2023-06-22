package datastructures;

import java.util.ArrayList;
import java.util.HashSet;

public class subArraySumZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		 A = [1, 2, 3, 4, 5]
//		-46, -16, 74, 18, 33, 20, -2, -7, 90, 100, -60, 12, -39, -3,  14, 95, -65, -38, 38, 75, -35, 32, -67, 58, 78, -91, 54, 52, 67, -43, -51, 
//		-75, -67, 4, 25, -22, 53, -33

		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);
//		A.add(-46);
//		A.add(-16);
//		A.add(74);
//		A.add(18);
//		A.add(33);
//		A.add(20);
//		A.add(-2);
//		A.add(-7);
//		A.add(90);
//		A.add(100);
//		A.add(-60);
//		A.add(12);
//		A.add(-39);
//		A.add(-3);
//		A.add(14);
//		A.add(95);
//		A.add(-65);
//		A.add(-38);
//		A.add(38);
//		A.add(75);
//		A.add(-35);
//		A.add(32);
//		A.add(-67);
//		A.add(58);
//		A.add(78);
//		A.add(-91);
//		A.add(54);
//		A.add(52);
//		A.add(67);
//		A.add(-43);
//		A.add(-51);
//		A.add(-75);
//		A.add(-67);
//		A.add(4);
//		A.add(25);
//		A.add(-22);
//		A.add(53);
//		A.add(-33);


		
		HashSet<Integer> hs = new HashSet<>();
		int sum =0;
		for(int i =0 ; i<A.size(); i++) {
			sum = sum + A.get(i);
			if(hs.contains(sum) == true) {
				System.out.println(1);
				System.out.println("******");
				break;
			}
			else {
					if(sum ==0) {
						System.out.println(1);
						System.out.println("~~~~~~~");
						break;
					}
					else {
					hs.add(sum);
				}
			}
			}
		
		
		System.out.println();
	}}


