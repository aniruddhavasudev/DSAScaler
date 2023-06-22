package AdvanceDSA;

public class BinaryGreedy {
	public static int minTime(String A, int B) {
		int n = A.length();
		int result = 0;
		for (int i = 0; i < n; i++) {
			if (A.charAt(i) == '0') {
				if (i + B > n) return -1;
				for (int j = i; j < i + B; j++) {
					if (A.charAt(j) == '0') result++;
				}
				i = i + B - 1;
			}
		}
		return result;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "00010110";
		int B = 3;
		System.out.println(minTime(A,B));
	}

}
