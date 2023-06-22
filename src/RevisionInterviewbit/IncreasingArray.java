package RevisionInterviewbit;

import java.util.Scanner;

public class IncreasingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long M = 0;
        
        long first = sc.nextLong();
        
        
        for (int i = 1; i < n; i++) {
        	 long Gi = sc.nextLong();
        	 
        	
        	 
        	 if(Gi > first) {
        		 first = Gi;
        	 }
        	 else if(Gi< first) {
        		 
        		 M = M + Math.abs(Gi-first);
        		 first = Gi + Math.abs(Gi-first);
        	 }
        	 else {
        		 first = Gi;
        	 }

        }
        
        System.out.println(M);
	}

}
