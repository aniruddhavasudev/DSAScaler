package AdvanceDSA;

public class ReverseStringRecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String A = "scaleracademy";
		char b ='c';
		rev(A);
		
		
	}
	
	public static void rev(String s) {
		
	
		    {
		        if ((s==null)||(s.length() <= 1))
		           System.out.print(s);
		        else
		        {
		        	System.out.print(s.charAt(s.length()-1));
		            rev(s.substring(0,s.length()-1));
		        }
		    }
		
	}

}
