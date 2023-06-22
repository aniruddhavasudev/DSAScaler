package AdvanceDSA;

public class NumberofOnebits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int A = 11;
		
		
		
		String B = Integer.toBinaryString(A);
		int count =0;
		for(int i =0; i<B.length() ; i++) {
			if(B.charAt(i) == '1') {
				count++;
			}
		}
		System.out.println(count);
	}

}
