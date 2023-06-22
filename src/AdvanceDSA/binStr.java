package AdvanceDSA;

import java.util.ArrayList;

class binStr
{
	static ArrayList<String>res = new ArrayList<String>();
	  static void genBin(String s) {
	    if (s.indexOf('*') != -1) {
	      String s1 = s.replaceFirst("\\*", "0"); 
	      String s2 = s.replaceFirst("\\*", "1"); 
	     
	      genBin(s1);
	      
	      genBin(s2);
	      
	    }
	    else res.add(s);
	  }
	 
	  public static void main(String[] args) {
	    genBin("1**0*101");
	    System.out.println(res);
	  }
	}

