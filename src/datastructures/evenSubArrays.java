package datastructures;

import java.util.ArrayList;

public class evenSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> A = new ArrayList<>();
		 A.add(2);
		 A.add(2);
		 A.add(2);
		 A.add(2);
		 
		 
		 
		        ArrayList<Integer> B = new ArrayList<>();
		        String y = "YES";
		        String n = "NO";

		        if((A.size())%2 == 0){
		            for(int i =0 ; i< A.size() ; i++){
		            	System.out.println((A.size()-1)/2);
		                if(A.get(0) %2 ==0 && i <=(A.size()-1)/2){
		                    B.add(A.get(i));
		                }
		                else if((A.get(A.size()-1) %2 ==0) && i>(A.size()-1)/2 ){
		                    B.add(A.get(i));
		                }
		                else{
		                    System.out.println(n);
		                }
		            }
		            System.out.println(y);

		        }

		        else{
		        	System.out.println(n);
		        }		
	}

}
