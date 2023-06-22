package datastructures;

import java.util.ArrayList;

public class sublistSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> A = new ArrayList<>();
		ArrayList<Integer> PF = new ArrayList<>();
		A.add(1);
		A.add(5);
		A.add(5);
		int B =2;
		int C =10;
		int sum =0;
		int k =0;
		int sum2 =0;
		
		   for(int i = 0 ; i< A.size() ; i++){
	            PF.add(sum+ A.get(i));
	        }
		   System.out.println(PF);

	        for(int i = 0 ; i< PF.size() ; i++){
	            if(i+B-1 < PF.size()){
	            if(i >0){
	                int c = PF.get(i-1);
	                int b = PF.get(i+(B-1));
	                System.out.println(b);
	                sum2 = b-c;
	                System.out.println(sum2);
	                if (sum2 == C){
	                    System.out.println("1");
	                }}
	            else{
	                int c =0;
	                int b = PF.get(i+B-1);
	                sum2 = b-c;
	                if (sum2 == C){
	                    System.out.println("1");
	                }
	            }
	            

	        }
	            }
	        }
}
		 

