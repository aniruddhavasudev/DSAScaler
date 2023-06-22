package datastructures;

public class Stringops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A="AbcaZeoB";
		
		String B = A.concat(A);
		
		StringBuilder sc= new StringBuilder(B);
		StringBuilder sb= new StringBuilder();
		StringBuilder sd= new StringBuilder();
//		
		
		
		
		for(int i=0; i<B.length() ; i++ ) {
			char c = B.charAt(i);
			
			if(Character.isUpperCase(c)){
			   continue;
			}
			else {
				sb.append(c);
			}
		}
		
		String D = sb.toString();
		
		for(int i =0; i<D.length() ; i++) {
			if (D.charAt(i) == 'a' || D.charAt(i) == 'e' || D.charAt(i) == 'i' || D.charAt(i) == 'o'
                    ||D.charAt(i) == 'u') {

                sd.append('#');

            }
			else {
				sd.append(D.charAt(i));
			}
		}
	
		String E = sb.toString();
		
		
	}

}
