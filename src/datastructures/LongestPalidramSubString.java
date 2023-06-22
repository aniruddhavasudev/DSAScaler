package datastructures;

public class LongestPalidramSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String A = "aaaabaaa";
	int max_length =0;
	StringBuilder sc = new StringBuilder();

	
	String max = "";
	
	for(int i =0; i<A.length() ; i++) {
		StringBuilder sb = new StringBuilder();
		for(int j=i ; j<A.length(); j++) {
			sb.append(A.charAt(j));
			if(sb.reverse() == (sb)) {
			if(sb.length() > sc.length()) {
				sc.delete(0, sc.length());
				sc.append(sb);
			}
			}
		}
		sb.delete(0,sb.length());
		System.out.println(sc);
		
	}
	max = sc.toString();

	}

}
