package datastructures;

public class alexbits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int A = 8;

		int B =0;
		int count=0;
		
		String s = Integer.toBinaryString(A);
		for(int i = s.length()-1 ; i >=0 ; i--) {
			
			if(s.charAt(i) =='1') {
				count++;
			}
		}
		System.out.println(s);
	}

}
