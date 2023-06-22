package datastructures;

import java.util.ArrayList;

public class str4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		 ArrayList<Integer> A = new ArrayList<>();
		 
		 int B = 8;
		 A.add(2);
		 A.add(4);
		 A.add(9);
		 A.add(1);
		 A.add(9);
		 A.add(7);
		 A.add(6);
		 A.add(4);
		 A.add(9);
		 
		 int C=0;
		 
			    
			    int count =0;
			        for(int i = 0 ; i<=A.size()-1 ;i++){
			            count = A.get(i) ;
			            
			            for(int j=i+1; j<= A.size()-1 ; j++){
//			            	if(A.get(i)+ A.get(j) ==  )
			                count = count + A.get(j);
			                System.out.println(count);
			                if(count == B){
			                	C++;
			                    count = A.get(i);
			                }
			                
			                count = A.get(i);
			                
			            }
			            count = 0;
			            
			        }
			        System.out.println(C);
		 }


	}
			        


