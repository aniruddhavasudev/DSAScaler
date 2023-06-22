package RevisionScalerMockInterviewRecurssion;

public class RecurssionNNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 5;
		int i =1;
		int add =1;
		System.out.println(sum(N,add));
	}

	public static int sum(int n,int add) {
		// TODO Auto-generated method stub
		if(n==1) {
			
			return add;
		}
		System.out.println(add);
		return sum(n-1,add) + n;
		
	}
	
	

}
