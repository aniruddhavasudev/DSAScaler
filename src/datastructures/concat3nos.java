package datastructures;

import java.util.ArrayList;
import java.util.Collections;

public class concat3nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 10;
		int B = 20;
		int C = 30;
		ArrayList<Integer> arr = new ArrayList<>();
		
		String p=String.valueOf(A);
		String q=String.valueOf(B);
		String r=String.valueOf(C);

		String m = p+q+r;
		String s = p+r+q;
		String t = q+p+r;
		String u = q+r+p;
		String v = r+p+q;
		String w = r+q+p;


		int n =Integer.valueOf(m);
		arr.add(n);
		int d =Integer.valueOf(s);
		int e =Integer.valueOf(t);
		int f =Integer.valueOf(u);
		int g =Integer.valueOf(v);
		int h =Integer.valueOf(w);
		arr.add(d);
		arr.add(e);
		arr.add(f);
		arr.add(g);
		arr.add(h);
		
		Collections.sort(arr);
		
		System.out.println(arr.get(0));
		
		
	}

}
