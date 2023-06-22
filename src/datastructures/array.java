package datastructures;

import java.util.HashMap;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[] = {1,3,5,6,8};
//		
//		for(int i =0; i<arr.length-1 ; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		LinkedList<String> boys = new LinkedList<>();
//		boys.add("Pradyumna");
//		boys.add("Vibodh");
//		boys.add("Aniruddha");
//		boys.add("Gagan");
//		boys.add("Shamanth");
//		
//		
//		for(int i =0;i< boys.size()-1;i++) {
//			
//			System.out.println(boys.get(i));
//		}
		
		
//		HashSet<String> girls = new HashSet<>();
//		girls.add("Payoshni");
//		girls.add("Meghana");
//		girls.add("Pramika");
//		girls.add("Harshita");
//		
//		ArrayList<String> con = new ArrayList<String>(girls);
//		
//		for(int i = 0 ; i<=girls.size()-1;i++) {
//			System.out.println(con.get(i));
//		}
		
		
		HashMap<Integer,String> goKarting = new HashMap<Integer,String>();
		goKarting.put(1, "Vibodh");
		goKarting.put(2, "Pradyumna");
		goKarting.put(3, "Shamanth");
		goKarting.put(4, "Ani");
		
		for(int i =1; i<=goKarting.size(); i++) {
			System.out.println(goKarting.get(i));
		}
	}

}
