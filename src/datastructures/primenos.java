package datastructures;

public class primenos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A =10;
		
		int countfactors;
		int countprimes = 0;
		
		for(int i = 1 ; i <= A ; i++) {
			double B = Math.sqrt(i);
			countfactors =0;
			for( int j = 1 ; j<= B ; j++) {
				if(i%j ==0) {
					if(j != i/j) {
						countfactors +=2;
					}
					else {
						countfactors ++;
					}
				}
				
			}
			if(countfactors ==2) {
				countprimes ++;
			}
		}
		
		System.out.println(countprimes);
	}

}
