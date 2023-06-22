package datastructures;

public class decimaltobit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 6;
		int B = 4;
		if(A == 0) {
//			return 0;
		}
		String s = null ;
		int remainder =0;
		int i =A;
	while(i>0) {
			if(i ==1) {
				 remainder =1;
				 if( s == null) {
					 s =  String.valueOf(remainder);
				 }
				 else {
					 s = s + String.valueOf(remainder);
					 System.out.println(s);
				 }
			}
			else {
				 remainder = i % B;
				 if( s == null) {
					 s =  String.valueOf(remainder);
					 System.out.println(s);
				 }
				 else {
					 s = s + String.valueOf(remainder);
					 System.out.println(s);
				 }
				
			}
			 
			 
			i = i/B;
			
		}
	
	
	StringBuilder input1 = new StringBuilder();
	input1.append(s);
	input1.reverse();
	System.out.println(input1);
	
	}

}
