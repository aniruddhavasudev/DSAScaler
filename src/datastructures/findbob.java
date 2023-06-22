package datastructures;

public class findbob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String A = "abobc";
		String bob ="bob";
		
		int count = 0;
		for(int i =0 ; i<A.length() ; i++) {
			
			StringBuilder sc = new StringBuilder();
			for(int j=i; j<i+3 && j < A.length() ; j++) {
				sc.append(A.charAt(j));
			}
			
			String singleString = sc.toString();
			
			if(singleString.equals(bob)) {
			
				count++;
			}
			sc.setLength(0);
		}
		
		System.out.println(count);
	}

}
