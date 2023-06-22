package AdvanceDSA;

public class AnotherCoinProbGreedy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 47;
		int num =0;
		int count =0;
		outerloop:
			for(int j =1; j<47; j++) {
				for(int i =1 ; i < 47; i++) {
					int fives = num + (int) Math.pow(5, i);
					if( fives > A ) {
						
						int fives2 =(int) Math.pow(5, i-1);
						num = num + fives2;
						count++;
						
						 if(num == A) {
							 break outerloop;
						 }
						System.out.println(num);
						break;
					}
					else if(num == A) {
						break outerloop;
					}

				}

			}

		System.out.println(count);

	}









}
