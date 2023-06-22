package AdvanceDSA;

public class StrangeEqualityBitManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 5;
		int sum =0;
		int X = 0;
		int Y = 0;
		
		for(int i = A-1 ; i>=0; i--){
			sum = A + i;

			int xorsum = A^i;
			if(sum == xorsum) {
				X = i;
				break;
			}
		}
		System.out.println(X);

		for(int i = A+1 ; i < Integer.MAX_VALUE; i++){
			
			sum = A + i;

			int xorsum = A^i;
			if(sum == xorsum) {
				Y = i;
				break;
			}
		}
		System.out.println(X^Y);
	}

}
