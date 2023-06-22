package datastructures;

import java.util.ArrayList;

public class armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A= 149;
		ArrayList<Integer> arm = new ArrayList<>();
		
		
		
		
		
		for(int i=1 ;  i<= A ; i++) {
			int number = i, originalNumber, remainder, result = 0;
        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
           arm.add(i);
        
    }
		System.out.println(arm);
		
	}
		
	}


