package datastructures;

import java.util.ArrayList;

public class listarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  list_Strings.add(0, "yellow");
		  list_Strings.get(0);
		  list_Strings.remove(2);
		  list_Strings.contains("Black");
		  list_Strings.contains(list_Strings);
		  
		  
		  for(int i=0; i<= list_Strings.size()-1;i++) {
			  System.out.println(list_Strings);
		  }
		  
		  
		  
		
	}

}
