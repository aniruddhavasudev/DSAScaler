package AdvanceDSA;

public class SmallestPrefixString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "tom";
		String B = "riddle";

		
	
			StringBuffer sc = new StringBuffer();
			int count =0;;
			int i =0;
			int j=0;
			while(count <1) {
				sc.append(A.charAt(i));
				i++;
				while(count <1) {
					if(sc.length() == A.length()) {
						sc.append(B.charAt(j));
						count++;
					}
					
					else if(A.charAt(i) >= B.charAt(j)) {
						sc.append(B.charAt(j));
						count++;
					}
					else {
						break;
					}
				}
	
			}

		System.out.println(count);
		System.out.println(sc);

	}
}