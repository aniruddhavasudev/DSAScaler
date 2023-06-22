package datastructures;

public class modONE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int A = 76277;
		int B = 376;
		int C = 2417;
		
		
		double pow = Math.pow(A, B);
		System.out.println(pow);
		if(pow > Integer.MAX_VALUE){
            pow = Integer.MAX_VALUE;
        }
		System.out.println((int)pow);
		System.out.println((int)pow%C);
		
	}

}
