package datastructures;

public class kthintrecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 3;
		int B = 0;
		
		System.out.println(solve(A,B));
		
	}
	
	
	public static int solve(int A, int B) {
		
		if(A==1)
		{
			return A;
		}
		
		long C = Long.MAX_VALUE;
		for(int i =0; i< C ; i++ ) {
			
		}
		
		return solve(A-1,B);
		
    }

}
