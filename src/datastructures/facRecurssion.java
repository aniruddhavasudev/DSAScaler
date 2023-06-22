package datastructures;

public class facRecurssion {
	static int fac(int n)
    {
        if (n == 1)
            return n;
        return fac(n - 1) * n;
    }
 
    public static void main(String args[])
    {
        int n = 4;
        System.out.println(fac(n));
    }
		}
