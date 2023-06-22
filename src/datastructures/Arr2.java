package datastructures;

public class Arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
		
		int min = arr[0] ;
		
		for(int i = 0 ; i<= arr.length -1 ; i++) {
			if(arr[i]< min && min != 0) {
				min = arr[i];
			}
			
			
		}
		System.out.println(min);
	}

}
