package datastructures;

public class binaryStringadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "1010110111001101101000";

		String b = "1000011011000000111100110";

		StringBuilder input1 = new StringBuilder();

		// append a string into StringBuilder input1
		input1.append(a);

		// reverse StringBuilder input1
		input1.reverse();

		StringBuilder input2 = new StringBuilder();
		input2.append(b);

		// reverse StringBuilder input1
		input2.reverse();
		int length;
		if(a.length() > b.length()) {
			 length = a.length();}
		else {
			 length = b.length();
		}
		
		StringBuilder sc = new StringBuilder();

		int carry =0;
		
		for(int i =0; i< length ; i++) {

			if(i < a.length() && i <b.length()) {
				char c = input1.charAt(i);
				char d = input2.charAt(i);

				if( c == '1' && d =='0') {
					if(carry ==1) {
						sc.append("0");
						carry =1;
					}
					else {
						sc.append("1");
					}
				}
				else if( c == '0' && d =='1') {
					if(carry ==1) {
						sc.append("0");
						carry =1;
					}
					else {
						sc.append("1");
					}
				}
				else if( c == '1' && d =='1') {
					if(carry ==1) {
						sc.append("1");
						carry =1;
					}
					else {
						sc.append("0");
						carry =1;
					}
				}
				else if( c == '0' && d == '0') {
					if(carry ==1) {
						sc.append("1");
					}
					else{
						sc.append("0");
					}
				}

			}
			else if(a.length() > b.length()){
				char c = input1.charAt(i);
				if( c == '1' ) {
					if(carry ==1) {
						sc.append("1");
						carry =1;
					}
					else {
						sc.append("1");
					}
				}
				else if( c == '0' ) {
					if(carry ==1) {
						sc.append("1");
					}
					else {
						sc.append("0");
					}
				}
				else if( c == '1') {
					if(carry ==1) {
						sc.append("1");
						carry =1;
					}
					else {
						sc.append("0");
						carry =1;
					}
				}
				else if( c == '0' ) {
					if(carry ==1) {
						sc.append("1");
					}
					else{
						sc.append("0");
					}
					}
				
				else if(a.length() < b.length()){
					char d = input1.charAt(i);
					if( d == '1' ) {
						if(carry ==1) {
							sc.append("1");
							carry =1;
						}
						else {
							sc.append("1");
						}
					}
					else if( d == '0' ) {
						if(carry ==1) {
							sc.append("1");
						}
						else {
							sc.append("0");
						}
					}
					else if( d == '1') {
						if(carry ==1) {
							sc.append("1");
							carry =1;
						}
						else {
							sc.append("0");
							carry =1;
						}
					}
					else if( d == '0' ) {
						if(carry ==1) {
							sc.append("1");
						}
						else{
							sc.append("0");
						}
						}
				}
			}
		
		
		
		
		}

		sc.reverse();
		System.out.println(sc);
		

	}
}


