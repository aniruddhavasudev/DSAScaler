package datastructures;

public class basetodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int A = 14;
		int B = 6;
		double C = 0;
		
		
		String s=String.valueOf(A);  
		int length = s.length()-1;
		System.out.println(length);
		
		for(int i = 0 ; i<s.length() ; i++) {
			String ins = String.valueOf(s.charAt(i));
			 int in = Integer.parseInt(ins);
			C = C + ( in * Math.pow(B, length));
			
			length--;
		}
		System.out.println(C);
	}

}
