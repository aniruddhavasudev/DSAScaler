package datastructures;

import java.util.Scanner;

public class reverseStringRecurssion {
	static void rev(String str)
    
		 {
		        if ((str==null)||(str.length() <= 1))
		           System.out.println(str);
		        else
		        {
		            System.out.print(str.charAt(str.length()-1));
		            rev(str.substring(0,str.length()-1));
		        }
		    }
		     
		    /* Driver program to test above function */
		    public static void main(String[] args)
		    {
		    	 Scanner ob = new Scanner(System.in); 
		    	 
		    	  String str = ob.nextLine();
		        reverseStringRecurssion obj = new reverseStringRecurssion();
		        obj.rev(str);
		    }   
		}