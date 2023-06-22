package datastructures;

public class magicnumrecur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int temp = 83557;
        for(int i=0 ; i<10 ; i++) {
        	
        	int temp2 = solve(temp);
        	temp = temp2;
        	System.out.println(temp);
        }
        
        if(temp ==1) {
        	System.out.println(1);
        }
	}
	
	    
		public static int solve(int A) {
		    if (A > 0 ) {
		      return A % 10 + solve(A/10)     ;
		    } else {
		      return 0;
		    }
		}
	
}
