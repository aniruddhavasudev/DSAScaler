package RevisionInterviewbit;
// Java program to find Excel
// column name from a given
// column number

public class ExcelColumntitle {
	// Function to print Excel column
	// name for a given column number
	private static String printString(int columnNumber)
	{
		// To store result (Excel column name)
		StringBuilder columnName = new StringBuilder();

		while (columnNumber > 0) {
			// Find remainder
			int rem = columnNumber % 26;

			// If remainder is 0, then a
			// 'Z' must be there in output
			if (rem == 0) {
				columnName.append("Z");
				columnNumber = (columnNumber / 26) - 1;
//				System.out.println(columnNumber);
			}
			else // If remainder is non-zero
			{
				System.out.println(rem);
				columnName.append((char)((rem - 1) + 'A'));
				columnNumber = columnNumber / 26;
//				System.out.println(columnNumber);
			}
		}
		String sc = columnName.reverse().toString();
		// Reverse the string and print result
		return sc;
	}

	// Driver program to test above function
	public static void main(String[] args)
	{
		System.out.println(printString(51));
		printString(51);
		printString(52);
		printString(80);
		printString(676);
		printString(702);
		printString(705);
	}
}

// This code is contributed by Harikrishnan Rajan
