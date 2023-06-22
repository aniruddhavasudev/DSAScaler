package AdvanceDSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class pubGArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []  A = {2, 3,4};


		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < A.length; i++) {
			pq.add(A[i]);
		}
		
		while (pq.size() > 1) {
			int a = pq.poll();
			int b = pq.poll();
			if (a >= b) {
				pq.add(a % b);
			} else {
				pq.add(b % a);
			}
		}

		System.out.println(pq.poll());
	}

}
