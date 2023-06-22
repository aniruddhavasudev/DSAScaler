package AdvanceDSA;

public class palindromeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String n = "1110909090";
		
		int num = Integer.parseInt(n);
		int numpo = Integer.parseInt(n);
		
		for(int i = 0; i < Integer.MAX_VALUE ; i++) {
			if(palindrome(n) == true) {
				System.out.println("Palindrome");
			}
			else {
				num--;
				numpo++;
				String neg = String.valueOf(num);
				String add = String.valueOf(numpo);
				if(palindrome(neg) ==  true) {
					System.out.println("" + neg);
					break;
				}
				if(palindrome(add) == true) {
					System.out.println("" + add);
					break;
				}
				
			}
		}
		System.out.println("Not palindrome");
		
		
	}
	
	public static boolean palindrome(String s) {
		
		int k=0;
		for(int j = s.length()-1 ; j >s.length()/2-1 ; j--) {
			if(s.charAt(j) == s.charAt(k)) {
				k++;
				continue;
			}
			else {
				return false;
			}
		}
		
		
		return true;
	}

}
