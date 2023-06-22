package datastructures;

import java.util.ArrayList;

public class matrixgeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int A = 5; 

		      ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		     ArrayList<Integer> matrix2 = new ArrayList<>();
		      if(A ==1){
		          matrix2.add(1);
		          matrix.add(matrix2);
		          System.out.println(matrix);
		      }
		      else if(A % 2 !=0) {
		    	  for(int l = 0; l < A ; l++){
				         ArrayList<Integer> rl = new ArrayList<>();
				          for(int m =0 ; m< A ; m++){
				              rl.add(m);
				          }
				          matrix.add(rl);
				      }

				        int i =0; int j=0;
				        A = matrix.size();
				        int count = 1;

				        while(A > 1){
				            for(int K =1 ; K<A ; K++ ){
				                matrix.get(i).set(j,count);
				                j++;
				                count++;
				                
				            }

				            for(int K =1 ; K<A ; K++ ){
				                matrix.get(i).set(j,count);
				                i++;
				                count++;
				               
				            }

				            for(int K =1 ; K<A ; K++ ){
				                matrix.get(i).set(j,count);
				                j--;
				                count++;
				               
				            }

				            for(int K =1 ; K<A ; K++ ){
				                 matrix.get(i).set(j,count);
				                i--;
				                count++;
				                System.out.println(count);
				               
				            }
				            
				            A = A-2;
				            i++;
				            j++;

				        }
				        A = A+2;
				        
				        
				        matrix.get(i).set(j, count);
				        
				       
		      }
		      
		      else{
		      for(int l = 0; l < A ; l++){
		         ArrayList<Integer> rl = new ArrayList<>();
		          for(int m =0 ; m< A ; m++){
		              rl.add(m);
		          }
		          matrix.add(rl);
		      }

		        int i =0; int j=0;
		        A = matrix.size();
		        int count = 1;

		        while(A > 1){
		            for(int K =1 ; K<A ; K++ ){
		                matrix.get(i).set(j,count);
		                j++;
		                count++;
		                System.out.println(count);
		            }

		            for(int K =1 ; K<A ; K++ ){
		                matrix.get(i).set(j,count);
		                i++;
		                count++;
		                System.out.println(count);
		            }

		            for(int K =1 ; K<A ; K++ ){
		                matrix.get(i).set(j,count);
		                j--;
		                count++;
		                System.out.println(count);
		            }

		            for(int K =1 ; K<A ; K++ ){
		                 matrix.get(i).set(j,count);
		                i--;
		                count++;
		                System.out.println(count);
		            }
		            A = A-2;
		            i++;
		            j++;

		        }
		         
		         }
		      System.out.println(matrix);
		    }
	}
		