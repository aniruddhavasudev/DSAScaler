package datastructures;

import java.util.ArrayList;

public class maxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>C = new ArrayList<>();
		C.add(7);
		C.add(1);
		C.add(8);
		C.add(5);
		C.add(8);
		C.add(5);
		C.add(3);
		C.add(3);
		C.add(5);
		
		int A = 9;
		int B = 78;
		int sum =0;
		int count =0;

		for(int i = 0 ; i < C.size() ; i++){
			count =0;
			sum =0;
			for(int j = i ; j< C.size() ; j++){

				if(sum < B && count <A ){
					sum = sum + C.get(j);
					count++;   
				}
				if(sum == B) {
					break ;
				}
				else{
					break;
				}
			}

		}
		if(sum <= B){
			System.out.println(sum);;}
		else{
			System.out.println("0");;
		}
	}



}

