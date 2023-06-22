package RevisionInterviewbit;

public class compare2Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(compare("695","52"));
	}
	
	public static int compare(String a, String b) {
		String ab = a + b;
		String ba = b + a;
	
		return ba.compareTo(ab);

	}

}
