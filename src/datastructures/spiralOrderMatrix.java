package datastructures;

import java.util.ArrayList;

public class spiralOrderMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		[
//		    [ 1, 2, 3 ],
//		    [ 4, 5, 6 ],
//		    [ 7, 8, 9 ]
//		]
		

//		  [75, 371]
//		  [230, 201]
//		  [58, 72]
//		  [128, 166]
//		  [198, 225]
//		  [170, 173]
//		  [401, 77]
//		  [229, 17]
//		  [304, 50]
//		]
		
//		[
//		  [133, 241, 22, 258, 187, 150, 79, 207, 196, 401, 366, 335, 198]
//		  [401, 55, 260, 363, 14, 318, 178, 296, 333, 296, 45, 37, 10]
//		  [112, 374, 79, 12, 97, 39, 310, 223, 139, 91, 171, 95, 126]
//		]
//		
		
		ArrayList<ArrayList<Integer>> A = new ArrayList<>();
		
		
		ArrayList<Integer> B = new ArrayList<>();
		B.add(133);
		B.add(241);
		
		
		ArrayList<Integer> C = new ArrayList<>();
		C.add(230);
		C.add(201);
		
		ArrayList<Integer> D = new ArrayList<>();
		C.add(230);
		C.add(201);
		
		
		
		
		A.add(B);
		A.add(C);
		A.add(D);
		
		
		        int i =0;
				int j=0;
				
				ArrayList<Integer> arr = new ArrayList<>();
				int len = A.size();
		        int len2 = A.get(0).size();
		        
		        if(A.get(0).size()==1){
		            for(int l =0 ; l<A.size();l++){
		                arr.add(A.get(l).get(0));
		            }
		        }
		        else{
				while(len > 1 && len2 >1) {
					
					for(int k =1 ; k <len2 ; k++ ) {
						arr.add(A.get(i).get(j));
						j++;
					}
					
					for(int k =1 ; k<len ; k++ ) {
						arr.add(A.get(i).get(j));
						i++;
					}
					
					for(int k =1 ; k <len2; k++ ) {
						arr.add(A.get(i).get(j));
						j--;
					}
					
					for(int k =1 ; k<len ; k++ ) {
						arr.add(A.get(i).get(j));
						i--;
					}
					len = len-2;
		            len2 = len2 -2;
		            System.out.println(len);
		            System.out.println(len2);
					i++;
					j++;
				}
				
				if(len ==1 && len2 ==1){
					arr.add(A.get(i).get(j));
				}
		        }
		        
		       System.out.println(arr);
		    }
		}
