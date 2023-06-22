package AdvanceDSA;

import java.util.HashSet;

public class DistinctPrimes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		ArrayList<Integer> A = new ArrayList<>();
		//		A.add(1);
		//		A.add(2);
		//		A.add(3);
		//		A.add(4);
		int A = 8;

		HashSet<Integer> m = new HashSet<>();
		int count =0;

		for(int j = A ; j > 1 ; j--) {
			int num = j;
			while (j%2==0)
			{
				m.add(2);
				j = j/2;


			}

			// n must be odd at this point.  So we can
			// skip one element (Note i = i +2)
//			System.out.println(j);
			for (int i = 3; i <= j; i++)
			{
				// While i divides n, print i and divide n
//				System.out.println(j);
				if(j >2) {
				while (j%i == 0)
				{
					m.add(i);
					j= j/i;

				}}
				else {
//					System.out.println(j);
				}

			}
			
			j = num;
			if(m.size() ==2) {
				count++;
				
				m.clear();

			}
			m.clear();
			
		}
		System.out.println(count);




	}

}
