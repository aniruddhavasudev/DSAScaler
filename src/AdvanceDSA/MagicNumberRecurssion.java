package AdvanceDSA;

public class MagicNumberRecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int test = 83557;
       
        int num = printFun(test);
        
		
		
		while(num >=0) {
			if(num <10) {
				if(num ==1) {
					System.out.println("1");
					break;
				}
				else {
					System.out.println("0");
					break;
				}
			}
			else {
				num = printFun(num);
			}
		}
		
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
