package datastructures;

public class MagicNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 10;
		int sum =0;

		for(int i =1; i<=10 ; i++) {
			if(i % 3 ==0) {
				sum = sum +5;
			}
			else {
				sum = (int) (sum + Math.pow(5, i));
			}
		}
		System.out.println(sum);
	}
}
