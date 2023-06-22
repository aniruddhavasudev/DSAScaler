package datastructures;

import java.util.ArrayList;

public class minSwaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A = new ArrayList<>();
	
		A.add(52);
		A.add(7);
		A.add(93);
		A.add(47);
		A.add(68);
		A.add(26);
		A.add(51);
		A.add(44);
		A.add(5);
		A.add(41);
		A.add(88);
		A.add(19);
		A.add(78);
		A.add(38);
		A.add(17);
		A.add(13);
		A.add(24);
		A.add(74);
		A.add(92);
		A.add(5);
		A.add(84);
		A.add(27);
		A.add(48);
		A.add(49);
		A.add(37);
		A.add(59);
		A.add(3);
		A.add(56);
		A.add(79);
		A.add(26);
		A.add(55);
		A.add(60);
		A.add(16);
		A.add(83);
		A.add(63);
		A.add(40);
		A.add(55);
		A.add(9);
		A.add(96);
		A.add(29);
		A.add(7);
		A.add(22);
		A.add(27);
		A.add(74);
		A.add(78);
		A.add(38);
		A.add(11);
		A.add(65);
		A.add(29);
		A.add(52); 
		A.add(36);
		A.add(21);
		A.add(94);
		A.add(46);
		A.add(52);
		A.add(47);
		A.add(87);
		A.add(33);
		A.add(87);
		A.add(70);
		
		int K =0;
      
        int G =0;
        int B = 19;
        
        for(int i =0 ; i<A.size() ; i++){
            if(A.get(i) <= B){
                K++;
            }}

        for(int i =0 ; i<K ; i++){
            if(A.get(i) <= B){
                G++;
        }}

        int Ans = Integer.MAX_VALUE;
        int L = 1;
        int R = K ;
        while ( R < A.size()){
         
           if(A.get(L-1) <= B){
                G--;
            }
            if(A.get(R) <= B){
                G++;
            }
            Ans = Math.min(Ans, K-G);
            
            L++;
            R++;
        }
        
       System.out.println(Ans);
        }
		
	}


