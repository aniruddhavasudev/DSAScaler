package datastructures;

public class AGcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A = "ABCGAG";
		int count =0;
		int ans = 0;
		
		for(int i=A.length()-1 ; i >=0 ; i-- ) {
			if(A.charAt(i) == 'G') {
				count++;
				System.out.println(count);
			}
			else if(A.charAt(i) == 'A') {
				ans = ans + count;
				System.out.println(ans);
			}
			
		}
			
		}

}
