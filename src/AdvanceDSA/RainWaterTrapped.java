package AdvanceDSA;

public class RainWaterTrapped {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A = {  0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		
		
		
		int PS[] = A.clone();	
		int SS[] = A.clone();
		
		int PMax =Integer.MIN_VALUE;
		int SMax =Integer.MIN_VALUE;
		int WL = Integer.MAX_VALUE;
		int Water = 0;
		
		int j= A.length-1;
		for(int i = 0; i<A.length ; i++) {
			PMax = Math.max(PMax, A[i]);
			PS[i] = PMax;
			SMax = Math.max(SMax, A[j]);
			SS[j] = SMax;
			j--;
		}
		
		for(int k=0; k<A.length; k++){
            if(k>0 && k<A.length-1) {
			WL = Math.min(PS[k-1],SS[k+1]);
			Water = Water + Math.max(0, WL - A[k]);
			
			}
        }
		
		
	}

}
