package RevisionInterviewbit;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {3, 30, 34, 5, 9};
		
		System.out.println(largestNumber(A));
		
	}
	
	    public static String largestNumber(int[] nums) {
	        // convert the array of integers to an array of strings
	        String[] strNums = new String[nums.length];
	        for (int i = 0; i < nums.length; i++) {
	            strNums[i] = Integer.toString(nums[i]);
	        }

	        // sort the array of strings using the custom comparator
	        Arrays.sort(strNums, new Comparator<String>() {
	            public int compare(String a, String b) {
	                String ab = a + b;
	                String ba = b + a;
	                return ba.compareTo(ab);
	            }
	        });

	        // check if the largest number is 0, in which case we return "0"
	        if (strNums[0].equals("0")) {
	            return "0";
	        }

	        // concatenate the sorted strings to form the largest number
	        StringBuilder result = new StringBuilder();
	        for (String str : strNums) {
	            result.append(str);
	        }
	        return result.toString();
	    }
	


}
