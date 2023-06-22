package datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;


public class matrixTranspose {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<Integer>> A = new ArrayList<>();
		
		 
		ArrayList<Integer> a1= new ArrayList<>();
		Integer[] ab = {24, 63, 39, 81, 84, 30};
		a1.addAll(Arrays.asList(ab));
		
		ArrayList<Integer> a2= new ArrayList<>();
		Integer[] ac = {21, 64, 95, 6, 88, 73};
		a2.addAll(Arrays.asList(ac));
		
		ArrayList<Integer> a3= new ArrayList<>();
		Integer[] ad = {33, 6, 63, 96, 86, 66};
		a3.addAll(Arrays.asList(ad));
		
		ArrayList<Integer> a4= new ArrayList<>();
		Integer[] at = {62, 88, 23, 52, 94, 77};
		a4.addAll(Arrays.asList(at));
		
		ArrayList<Integer> a5= new ArrayList<>();
		Integer[] au = {81, 58, 74, 18, 16, 25};
		a5.addAll(Arrays.asList(au));
		
		ArrayList<Integer> a6= new ArrayList<>();
		Integer[] av = {26, 40, 88, 64, 72, 23};
		a6.addAll(Arrays.asList(av));
		
		ArrayList<Integer> a7= new ArrayList<>();
		Integer[] aw = {45, 44, 86, 92, 50, 26};
		a7.addAll(Arrays.asList(aw));
		
		ArrayList<Integer> a8= new ArrayList<>();
		Integer[] ax = {64, 34, 83, 26, 29, 68};
		a8.addAll(Arrays.asList(ax));
		
		ArrayList<Integer> a9= new ArrayList<>();
		Integer[] ay = {43, 42, 7, 17, 45, 52};
		a9.addAll(Arrays.asList(ay));
		
		ArrayList<Integer> a10= new ArrayList<>();
		Integer[] az = {94, 25, 62, 19, 95, 77};
		a10.addAll(Arrays.asList(az));
		
		A.add(a1);
		A.add(a2);
		A.add(a3);
		A.add(a4);
		A.add(a5);
		A.add(a6);
		A.add(a7);
		A.add(a8);
		A.add(a9);
		A.add(a10);
		
//		System.out.println(A);
		ArrayList<ArrayList<Integer>> B = new ArrayList<>();
		Vector<Integer> v = new Vector<Integer>();
//		System.out.println(A.size());
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);
		
		A.stream().toArray();
		System.out.println(A);
		
		
		for(int i =0; i<A.get(i).size() ; i++) {
//			System.out.println(A.get(i).size());
			for(int j = 0 ; j < A.size() ; j++ ) {
				int n= A.get(j).get(i);
			    v.add(n);
			}
			ArrayList<Integer> bi= new ArrayList<>(v);
			Collections.reverse(bi);
			B.add(bi);
			System.out.println(bi);
			v.clear();
			}
            
		}
//	
//	ArrayList<ArrayList<Integer>> C = new ArrayList<>();
//	Vector<Integer> y = new Vector<Integer>();
//	
//	for(int i =0; i<B.get(i).size() ; i++) {
////		System.out.println(A.get(i).size());
//		for(int j = 0 ; j < B.size() ; j++ ) {
//			int n= A.get(j).get(i);
//		    y.add(n);
//		}
//		ArrayList<Integer> ci= new ArrayList<>(v);
//		C.add(ci);
//		System.out.println(ci);
//		y.clear();
//		}
//        System.out.println(C);
//	}
//		
//		
		
	}


