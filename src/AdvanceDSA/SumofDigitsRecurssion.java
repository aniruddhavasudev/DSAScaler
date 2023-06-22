package AdvanceDSA;

public class SumofDigitsRecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int test = 46;
       
        
		System.out.println( printFun(test));
		
	}
	static int printFun(int test)
    {
		int test2 = 0;
		if(test <1) {
			return test;
		}
		else if(test <10) {
		test2 = test;
		test = test/10;
		}
		else {
		test2 =test%10;
		
		test = test/10;}
		
		
		return  test2 + printFun(test) ;
        
        
    }
}
