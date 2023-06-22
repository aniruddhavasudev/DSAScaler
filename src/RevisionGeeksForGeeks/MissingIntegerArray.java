package RevisionGeeksForGeeks;

public class MissingIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2};
		
		System.out.println((firstMissingPositive(array))); 
	}

	
	public static int firstMissingPositive(int[] array) {
		
        int n = array.length;
        for (int i = 0; i < n; i++) {
        	 int pos = array[i] - 1;
        	 System.out.println(i);
        	  if (array[pos] != array[i]) {
                  int temp = array[pos];
                  array[pos] = array[i];
                  array[i] = temp;
                  // Collections.swap(array, pos, i);
                  
                  i--;
                  // We are doing i-- as we have swapped i'th element with pos'th element and we might not have processed the pos'th element.
              }
          }

      for (int i = 0; i < n; i++) {
          if (array[i] != i + 1) 
              return ((i + 1));
      
        }
        return n + 1;
    }
}

