package datastructures;

public class practicesubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int L =4; int R=5;
		String str = "xbdyzzydbdyzydx";
		int N = str.length();
		StringBuilder sb = new StringBuilder();
		while(L>=0 && R < N) {
			if(str.charAt(L) != str.charAt(R)) {
				break;
			}
			
		    sb.insert(0, str.charAt(L));
		    sb.insert(sb.length(), str.charAt(R));
			L--; R++;
			
		}
		
		System.out.println(sb);
		
	}

}
