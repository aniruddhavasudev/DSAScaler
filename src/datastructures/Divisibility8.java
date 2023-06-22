package datastructures;

public class Divisibility8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String A ="123";
		if(A.length() >3) {
		StringBuilder s = new StringBuilder();
		for(int i =A.length()-4; i<A.length() ; i++) {
				s.append(A.charAt(i));
		}
		int C = Integer.valueOf(s.toString().trim());
		if(C % 8 ==0) {
//			  return 1;	
		}
		else {
//			return 0;
		}
		}
		
		else {
			
			   int B = Integer.valueOf(A);
			   if(B % 8 ==0) {
//				   return 1;	
			}
			   else {
//				   return 0;
			   }
		}
		
	}

}
