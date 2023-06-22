package RevisionInterviewbit;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {444, 994, 508, 72, 125, 299, 181, 238, 354, 223, 691, 249, 838, 890, 758, 675, 424, 199, 201, 788, 609, 582, 979, 259, 901, 371, 766, 759, 983, 728, 220, 16, 158, 822, 515, 488, 846, 321, 908, 469, 84, 460, 961, 285, 417, 142, 952, 626, 916, 247, 116, 975, 202, 734, 128, 312, 499, 274, 213, 208, 472, 265, 315, 335, 205, 784, 708, 681, 160, 448, 365, 165, 190, 693, 606, 226, 351, 241, 526, 311, 164, 98, 422, 363, 103, 747, 507, 669, 153, 856, 701, 319, 695, 52 };

		String[] B = new String[A.length];

		for (int i = 0; i < A.length; i++) {
			B[i] = Integer.toString(A[i]);
		}

		

		
		if(comparator(B) != null) {
			System.out.println(Arrays.toString(B));
		}
		else {
			Arrays.sort(A);
			System.out.println(Arrays.toString(A));
		}






	}



	public static int[] comparator(String [] B ) {
		outerloop:
			for(int i =B.length-1 ; i>=0 ; i--) {

				for(int j = i ; j >=1; j--) {
				

					int m = compare(B[i], B[j-1]);

					if(m < 0) {
						swap(B,i,j-1);
						if(B[i].length() == B[j-1].length()) {
						compare(B[i], B[j-1]);
						}
						else {
							
						}
						return (convert2intArray(B));
					}
					else if(m==0) {
						break;
					}
					else {
						continue;
					}
				}
			}

		return null;

	}


	public static int compare(String a, String b) {
		String ab = a + b;
		String ba = b + a;
	
		return ba.compareTo(ab);

	}

	public static String[] swap(String [] C ,int idx1, int idx2) {
		String tmp = C[idx1];
		C[idx1] = C[idx2];
		C[idx2] = tmp;
		return C;

	}

	public static int[] convert2intArray(String [] D) {
		int[] E = new int[D.length];

		for (int i = 0; i < D.length; i++) {
			E[i] = Integer.valueOf(D[i]);
		}
		return E;

	}
}
