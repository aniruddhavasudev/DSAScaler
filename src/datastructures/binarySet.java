package datastructures;

public class binarySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a =13;
		
		String s = Integer.toBinaryString(a);
		System.out.println(s);
		int count =0;
		int j=0;
		int k =0;
			for(int i=s.length()-1; i >=0; i--) {
			
			if(j==2) {
				k = s.charAt(i) - '0';
			}
				
				j++;
			}
			
		if(k ==1) {
			System.out.println(1);
		}
	}

}
