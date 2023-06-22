package datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {2,4,6,8};
		int arr2[] = {1,3,5,7};
		int arr3[] = new int[8];
		int a = arr1.length;
		int b = arr2.length;
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for(int i =0  ; i <= arr2.length-1;i++) {

			arr.add(arr2[i]);

		}

		for(int i =0  ; i <= arr1.length-1;i++) {

			arr.add(arr1[i]);

		}

		Collections.sort(arr);
		System.out.println(arr);

		for(int i =0  ; i <= arr.size() -1 ;i++) {

			arr3[i] = arr.get(i);

		}
		
	 System.out.println(Arrays.toString(arr3));


	}

}
