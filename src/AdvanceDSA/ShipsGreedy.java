package AdvanceDSA;

import java.util.ArrayList;
import java.util.Collections;

public class ShipsGreedy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 10;
		int dec = A;
		int minimum = 0;
		int maximum = 0;
		int[] C = {10, 3, 3, 1, 2};
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		  
        // populate the list
        list.add(10);
        list.add(3);
        list.add(3);
        list.add(1);
        list.add(2);
        list2.addAll(list);
       
       
       while(dec >0) {
    	   int max = Collections.max(list);
           int index = list.indexOf(max);
           maximum = maximum + max;
           list.set(index, max-1);
           dec--;
       }
       dec = A;
       System.out.println(maximum);
        
       while(dec >0) {
    	   int min = Collections.min(list2);
           int index = list2.indexOf(min);
            min = Collections.min(list2);
            index = list2.indexOf(min);
           minimum = minimum + min;
           
           if(min-1 ==0) {
           list2.set(index, Integer.MAX_VALUE);
           }
           else {
        	   list2.set(index, min-1);
           }
           dec--;
       }
       System.out.println(minimum);
		
	}

}
