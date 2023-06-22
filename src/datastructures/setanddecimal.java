package datastructures;

public class setanddecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 25;
		int B = 3;

		System.out.println(Integer.toBinaryString(A));
		System.out.println(A &= ~((1 << (B-3))));
		System.out.println(Integer.toBinaryString(24));
		int j = B;
		for(int i = 0; i < B ; i++) {
			System.out.println(A &= ~((1 << (B-j))));
			j--;
		}
	}

}
