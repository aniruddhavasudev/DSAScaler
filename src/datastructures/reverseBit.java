package datastructures;

public class reverseBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 long A = 3;
		 
		 String result = Long.toBinaryString( A | 0x100000000L ).substring(1);
		 
		 System.out.println(result);
		 StringBuilder sc = new StringBuilder();
		 
		 for(int i = result.length()-1; i>=0 ; i--) {
			 
			 sc.append(result.charAt(i));
			 
		 }
		  String B = (sc.toString());
		long C=  Long.parseLong(B, 2);
		  System.out.println(C);
		
	}

}
