package datastructures;

public class changeCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A = "abcabbccd";
		StringBuilder sb = new StringBuilder(A);
		int B = 3;
		
		int count[] = new int[256];

		int len = A.length();
        for (int i = 0; i < len; i++) {
            count[A.charAt(i)]++;}
        
        int max = -1; // Initialize max count
        char result = ' '; // Initialize result
        
        for (int i = 0; i < len; i++) {
            if (max < count[A.charAt(i)]) {
                max = count[A.charAt(i)];
                result = A.charAt(i);
            }
        }
        
        System.out.println(result);
	}
}
