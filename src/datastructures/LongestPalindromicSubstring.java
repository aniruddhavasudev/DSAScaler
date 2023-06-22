package datastructures;

public class LongestPalindromicSubstring {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Ans =0;
		String str = "xbdyzzydbdyzydx";
		int N = str.length();
		StringBuilder sb = new StringBuilder();
		StringBuilder sc = new StringBuilder();
		for(int i=0; i<N; i++) {

			if(i<N-1 && str.charAt(i) == str.charAt(i+1)) {
				int L = i-1 ; int R = i+1;
				while(L>=0 && R < N) {
					if(str.charAt(L) != str.charAt(R)) {
						break;
					}
					else {
					sb.insert(0, str.charAt(L));
					sb.insert(sb.length(), str.charAt(R));
					L--; R++;}
				}
				
				Ans = Math.max(Ans, R-L-1);
			}
			else if(i<N-1) {
				
				int L = i ; int R = i+1;
				while(L>=0 && R < N) {
					if(str.charAt(L) != str.charAt(R)) {
						break;
					}
					else {
					sc.insert(0, str.charAt(L));
					sc.insert(sc.length(), str.charAt(R));
					L--; R++;}
				}
				
				Ans = Math.max(Ans, R-L-1);
			}

		}
		System.out.println(Ans);

	}

}
