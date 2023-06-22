package datastructures;

public class factorsSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print1toA(10,1);
		int i =1;
	}





	public static void print1toA(int A, int i){
		if(A == 0  && i >=A+1){
			return;
		}
		
			System.out.print(i+ " ");
			i++;
			print1toA(A-1,i++);

		
	}

}
