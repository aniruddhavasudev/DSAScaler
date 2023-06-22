package datastructures;

public class arr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3, 6, 1, 8, 4, 2};
		int lastelement = arr[arr.length-1];
		
		
		for(int i = arr.length - 1; i >0 ; i-- ) {
			
			arr[i] = arr[i-1];
		}
		arr[0] =lastelement;
		
		
		for(int i=0; i<= arr.length-1 ; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
