package datastructures;

import java.util.ArrayList;

public class minAvgArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int B = 6;
		
				
		ArrayList<Integer> A = new ArrayList<>();	
		A.add(15);
		A.add(7);
		A.add(11);
		A.add(7);
		A.add(9);
		A.add(8);
		A.add(18);
		A.add(1);
		A.add(16);
		A.add(18);
		A.add(6);
		A.add(1);
		A.add(1);
		A.add(4);
		A.add(18);
	
	     int sum =0;
	        ArrayList<Integer> PF = new ArrayList<>();

	        for(int i = 0 ; i< A.size() ; i++){
	            sum = sum+A.get(i);
	            PF.add(sum);
	        }

	        int R = B-1;
	        int L = 0;
	        float min = Integer.MAX_VALUE; 
	        int Z =0;

	        while(R < A.size()){
	            if(L > 0){
	            float N = PF.get(R) - PF.get(L-1) ;
	             float X = N/B;
	             
	            if(X < min) {
	            	min = X;
	                Z = L;
	                System.out.println(L); 
	                
	            }
	            L++;
	            R++;
	            }
	            else if(L ==0)
	            {
	            float N = PF.get(R) - 0 ;
	            float X = N/B;
	            
	            
	            if(X < min){
	            	min = X;
	                Z = L;
	                
	            }
	            L++;
	            R++;
	            }
//	            System.out.println(R); 
	            
	        }
	        System.out.println(Z);
	        System.out.println(PF);
	  
	       

	    }
		
	}


