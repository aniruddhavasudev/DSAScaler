package RevisionInterviewbit;

public class Powerof2Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 4;

		System.out.println(power(A));
	}

	public static int power(int A) {

		int num = 0;
		double p = 0;
		
		outerloop:
		for(int i =2; i<Math.sqrt(A) ; i++) {
			for(int j =2; j <= A && Math.pow(i,j) <= A  ; j++) {
				if(Math.pow(i, j) == A) {
					num =1;
					break outerloop;
				}
				else {
					continue;
				}
				
			}
		}


		return num;
	}

}
