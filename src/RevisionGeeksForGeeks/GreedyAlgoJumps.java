package RevisionGeeksForGeeks;

public class GreedyAlgoJumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 11;
		int	arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

		int n = arr.length;
	    if (n == 0 || arr[0] == 0) {
	        System.out.println(-1);
	    }
	    int jumps = 1;
	    int start = 0;
	    int end = arr[0];
	    while (end < n - 1) {
	        int maxIndex = start;
	        int maxDist = 0;
	        for (int i = start + 1; i <= end; i++) {
	            if (i + arr[i] > maxDist) {
	                maxIndex = i;
	                maxDist = i + arr[i];
	            }
	        }
	        System.out.println(maxIndex);
	        if (maxIndex == start) {
	        	 System.out.println(-1);
	        }
	        start = maxIndex;
	        end = maxDist;
	        jumps++;
	    }
	    System.out.println(jumps);

		
		
	}

}
