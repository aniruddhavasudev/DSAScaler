package datastructures;

public class str1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Java Exercises";
		
		int n = 6;
		
		for(int i=0; i<=a.length()-1 ; i++) {
			if(i == n) {
				System.out.println(a.charAt(i));
			}
		}
	}

}
