package RevisionInterviewbit;

import java.util.Scanner;

public class WeirdAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

		long p =n;
		System.out.print(p + " ");
		for(int i=0; i<Integer.MAX_VALUE ;i++) {
			if(p % 2 == 0) {
				p  = p/2;
				System.out.print(p + " ");
			}
			else if(p ==1) {
				break;
			}
			else {
				p =( p * 3 ) + 1;
				System.out.print(p + " ");
			}
		}
	}

}
