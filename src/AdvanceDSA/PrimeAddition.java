package AdvanceDSA;

public class PrimeAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 131;
		int i =2;
		boolean flag = false;
		while (i <= A / 2) {
		      // condition for nonprime number
		      if (A % i == 0) {
		        flag = true;
		        break;
		      }

		      ++i;
		    }
		if(!flag) {
			System.out.println("1");
		}
		else {
		
		if(A % 2 ==0) {
			System.out.println("2");
		}
		
		else {
			boolean flag2 = false;
			while (i <= A-2 / 2) {
			      // condition for nonprime number
			      if (A-2 % i == 0) {
			        flag2 = true;
			        break;
			      }

			      ++i;
			    }
			if (!flag) {
			      System.out.println("2");}
			else {
				 System.out.println("3");
			}
			
		}
		
	}
	}

}
