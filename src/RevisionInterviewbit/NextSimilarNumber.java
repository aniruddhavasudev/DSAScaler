package RevisionInterviewbit;

public class NextSimilarNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A = "892795";

		System.out.println(next(A));

	}

	public static String next(String A ) {

		String B = "-1";
		String E = "";
		char ch[] = A.toCharArray();
		int fix =0;

		//		char [] arr = new int[A.length()];
		outerloop:
			for(int i=A.length()-1; i> 0; i--) {

				for(int j =i ; j >= 0 ; j--) {
					int c = A.charAt(i) - '0';
					int d = A.charAt(j) - '0';

					if(c > d) {
						ch = swap(A,i,j);
						fix = j;
						
						B = new String(ch);
						break outerloop;

					}
				}

			}
		
		if(B == A) {
			return "-1";
		}

		for(int i=B.length()-1; i> fix; i--) {

			for(int j =i ; j > fix ; j--) {
				int c = B.charAt(i) - '0';
				int d = B.charAt(j) - '0';
				
				if(c < d) {
					ch = swap(B,i,j);

					B = new String(ch);
					

				}
			}

		}


		return B;
	}

	static char[] swap(String str, int i, int j)
	{
		char ch[] = str.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return ch;
	}
}

