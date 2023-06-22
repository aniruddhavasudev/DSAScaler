package AdvanceDSA;

public class KthSymbolRecurrsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 3;
		int B = 0;
		int count =0;
		String sc = "0";
		
		System.out.println(1/2);
		String kth = kthsymbol(A,count,sc);
		
		System.out.println(kth.charAt(B));
		
	}
	
	public static String kthsymbol(int A, int count,String sc) {
		
		if(count == A) {
			return sc;
		}
		
		else {
			String sd = sc;
//			System.out.println(sd);
			count++;
			sc = "";
			
			for(int i =0; i<sd.length(); i++) {
				if(sd.charAt(i) == '0') {
					sc = sc + "01";
				}
				else if(sd.charAt(i) == '1') {
					sc = sc + "10";
				}
			}
		}
		
		return kthsymbol(A,count,sc);
	}
	
	

}
