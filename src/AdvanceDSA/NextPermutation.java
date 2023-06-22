package AdvanceDSA;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int A = 10;
		
		 int countr = 0;
		    for (int i = 1; i <= A; i++)
		    {
		        String str = String.valueOf(i);
		        countr += str.split("1", -1).length - 1;
		        
		    }
		    System.out.println(countr);
		    String str = String.valueOf(A);
		    str.split("1", -1);
		    System.out.println(str.split("1", -1).length-1);
	}

}
