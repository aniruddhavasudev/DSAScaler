package RevisionInterviewbit;

import java.util.Scanner;

public class Repetitions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 String A = sc.next();
		 long N  =1;
		 long max  =1;
		 for(int i=1; i<A.length() ; i++) {
			 if(A.charAt(i) == A.charAt(i-1)) {
				 N = N +1;
				 max = Math.max(max, N);
			 }
			 else {
				 max = Math.max(max, N);
				 N = 1;
			 }
		 }
		
		 System.out.println(max);
	}

}
