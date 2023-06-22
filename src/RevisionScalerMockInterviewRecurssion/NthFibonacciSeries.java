package RevisionScalerMockInterviewRecurssion;

public class NthFibonacciSeries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 5;
		int i =1;
		int add =0;
		System.out.println(fibonacci(N));
	}

	public static int fibonacci(int n) {
		// TODO Auto-generated method stub
		if(n==1) {
			return 0;
		}
		if(n==2) {
			return fibonacci(n-1) + 1 ;
		}
		if(n==3) {
			return fibonacci(n-1) + fibonacci(n-2);
		}
		
		else {
		return (fibonacci(n-1)) + (fibonacci(n-2));
		}
		
	}
	
	

}
