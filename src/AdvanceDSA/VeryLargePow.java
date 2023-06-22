package AdvanceDSA;

public class VeryLargePow {

	public static void main(String[] args) {

		int A = 2;
		int B = 27;
		int bfac = 1;
        long M = 1000000007;
		for(int i = 2 ; i<=B ; i++) {
            bfac = bfac *i;
            
		}
		int Apow = A;
		System.out.println(bfac);
		for(int i = 1 ; i<bfac ; i++) {
            Apow = (int) (((Apow%M) *(A%M))%M);
            
		}
		
		
		System.out.println((int) (Apow%M));
		

	}

}
