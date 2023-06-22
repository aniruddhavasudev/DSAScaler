package datastructures;

import java.util.ArrayList;

public class MaxSubarraycount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A = new ArrayList<>();
		A.add(5);
		A.add(6);
		A.add(-1);
		A.add(7);
		A.add(8);
		
		 ArrayList<Integer> B = new ArrayList<>();
	        int count = 0;
	        int maxcount =0;
	        int backwardcount =0;
	        int forwardcount =0;
	        int ib = 0;
	        int f = 0;
	        int direction =0;

	        for(int i=0; i<A.size(); i++){
	          forwardcount = 0;
	          backwardcount = 0;

	          if(A.get(i) < 0){
	             count++;
	             for(int j = i-1 ; j >=0 ; j--){
	                 if(A.get(j) >= 0){
	                     backwardcount++;
	                }
	                else if(A.get(j) < 0){
	                    break;
	                }
	                
	                }
	                
	            for(int j = i+1 ; j < A.size() ; j++){
	                if(A.get(j) > 0){
	                    forwardcount++;
	                }
	                 else if(A.get(j) < 0){
	                    break;
	                }}
	                if(backwardcount > forwardcount){
	                    if(backwardcount > maxcount){
	                    ib = i;
	                    maxcount = backwardcount;
	                    direction = 0;
	                }}
	                else if (backwardcount < forwardcount){
	                    if(forwardcount > maxcount){
	                    f = i;
	                    maxcount = forwardcount;
	                    direction =1;
	                }}}
	        }

	       if(count == 0){
	          System.out.println(A);
	       }
	        else if(direction == 0){
	            for(int k = ib+1 ; k >(ib+2 -count) ; k--){
	                 if(A.get(k) < 0){
	                     break;}
	                 else{
	                 B.add(A.get(k));
	            }}
	            System.out.println(B);
	            }
	        else{
	             for(int k = f+1 ; k <(f+2 +count) ; k++){
	                 if(A.get(k) < 0){
	                     break;
	                 }
	                 else{
	                B.add(A.get(k));}
	            }
	            System.out.println(B);
	        }
	        }
		
	}


