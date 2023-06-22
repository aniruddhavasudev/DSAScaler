package AdvanceDSA;

public class CountA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A = "aab";

		int count = 0;
		int left = Integer.MIN_VALUE;
		int right =0;

		StringBuffer sc = new StringBuffer();

		while(left <= A.length()-1 ) {

			sc.append(A.charAt(right));
			

			System.out.println(A.charAt(right));

			if(sc.charAt(0) == 'a' && sc.charAt(sc.length()-1) =='a' ) {
				count++;
			}

			System.out.println(sc);

			while(left<right){
				if(left< 0) {
				left = 0;
				}

				if(A.charAt(left) != 'a') {
					left++;
				}

				else {

					sc.append(A.charAt(left));

					if(sc.charAt(0) == 'a' && sc.charAt(sc.length()-1) =='a' ) {
						count++;
					}

					sc.delete(0, sc.length()-1);

				}

			}
			right++;

		}


		System.out.println(count);
	}

}
