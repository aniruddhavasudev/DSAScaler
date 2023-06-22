package datastructures;

public class fibonacciRecursion {

	static String fib(String s1)
	{
		 int n = Integer.parseInt(s1);
			String s2 = Integer.toString(n);
			String s3 = Integer.toString(n-1);
			if (n <= 1)
				return s2;
			else {
				// Concatenate both strings
				String s = s2 ;

				return fib(s3) + " "+ s;
	    }
	}

	public static void main(String args[])
	{
		int n = 10;
		String s1 = Integer.toString(n);
		System.out.println(fib(s1));
	}
}