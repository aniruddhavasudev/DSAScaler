package AdvanceDSA;

import java.util.ArrayList;

public class absmaxdiffArraysMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		A = [1, 2, 3, 4]
		//				B = [-1, 4, 5, 6]
		//						C = [-10, 5, 3, -8]
		//								D = [-1, -9, -6, -10]

		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);

		ArrayList<Integer> B = new ArrayList<>();
		B.add(-1);
		B.add(4);
		B.add(5);
		B.add(6);

		ArrayList<Integer> C = new ArrayList<>();
		C.add(-10);
		C.add(5);
		C.add(3);
		C.add(-8);

		ArrayList<Integer> D = new ArrayList<>();
		D.add(-1);
		D.add(-9);
		D.add(-6);
		D.add(-10);

		int Xmax= Integer.MIN_VALUE;
		

		//		 | A [ i ] - A [ j ] | + | B [ i ] - B [ j ] | + | C [ i ] - C [ j ] | + | D [ i ] - D [ j ] | + | i - j| 

		for(int i=0; i<A.size() ; i++) {
			int E = A.get(i)+B.get(i)+C.get(i)+D.get(i)-i;
			int F = A.get(i)+B.get(i)+C.get(i)+D.get(i)+i;
			int G = A.get(i)-B.get(i)+C.get(i)+D.get(i)-i;
			int H = A.get(i)-B.get(i)+C.get(i)+D.get(i)+i;
			int I = A.get(i)+B.get(i)-C.get(i)+D.get(i)-i;
			int J = A.get(i)+B.get(i)-C.get(i)+D.get(i)+i;
			int K = A.get(i)+B.get(i)+C.get(i)-D.get(i)-i;
			int L = A.get(i)+B.get(i)+C.get(i)-D.get(i)+i;
			int M = -A.get(i)+B.get(i)+C.get(i)+D.get(i)-i;
			int N = -A.get(i)+B.get(i)+C.get(i)+D.get(i)+i;
			int O = A.get(i)-B.get(i)-C.get(i)+D.get(i)-i;
			int P = A.get(i)-B.get(i)-C.get(i)+D.get(i)+i;
			int E2 = A.get(i)+B.get(i)-C.get(i)-D.get(i)-i;
			int F2 = A.get(i)+B.get(i)-C.get(i)-D.get(i)+i;
			int G2 = -A.get(i)+B.get(i)+C.get(i)-D.get(i)-i;
			int H2 = -A.get(i)+B.get(i)+C.get(i)-D.get(i)+i;
			int I2 = -A.get(i)-B.get(i)+C.get(i)+D.get(i)-i;
			int J2 = -A.get(i)-B.get(i)+C.get(i)+D.get(i)+i;
			int K2 = A.get(i)-B.get(i)-C.get(i)-D.get(i)-i;
			int L2 = A.get(i)-B.get(i)-C.get(i)-D.get(i)+i;
			int M2 = -A.get(i)+B.get(i)-C.get(i)-D.get(i)-i;
			int N2 = -A.get(i)+B.get(i)-C.get(i)-D.get(i)+i;
			int O2 = -A.get(i)-B.get(i)+C.get(i)-D.get(i)-i;
			int P2 = -A.get(i)-B.get(i)+C.get(i)-D.get(i)+i;
			int E3 = -A.get(i)-B.get(i)-C.get(i)+D.get(i)-i;
			int F3 = -A.get(i)-B.get(i)-C.get(i)+D.get(i)+i;
			int G3 = -A.get(i)-B.get(i)-C.get(i)-D.get(i)-i;
			int H3 = -A.get(i)-B.get(i)-C.get(i)-D.get(i)+i;
			int I3 = -A.get(i)+B.get(i)-C.get(i)+D.get(i)-i;
			int J3 = -A.get(i)+B.get(i)-C.get(i)+D.get(i)+i;
			int K3 = A.get(i)-B.get(i)+C.get(i)-D.get(i)-i;
			int L3 = A.get(i)-B.get(i)+C.get(i)-D.get(i)+i;

			int Ans1 = Math.max(E, F);
			int Ans2 = Math.max(Ans1, G);
			int	Ans3 = Math.max(Ans2, H);
			int	Ans4 =Math.max(Ans3, I);
			int	Ans5 = Math.max(Ans4, J);
			int	Ans6 = Math.max(Ans5, K);
			int	Ans7= Math.max(Ans6, L);
			int	Ans8= Math.max(Ans7, M);
			int	Ans9= Math.max(Ans8, N);
			int	Ans10= Math.max(Ans9, O);
			int	Ans11= Math.max(Ans10, P);
			int	Ans12= Math.max(Ans11, E2);
			int	Ans13= Math.max(Ans12, F2);
			int	Ans14= Math.max(Ans13, G2);
			int	Ans15= Math.max(Ans14, H2);
			int	Ans16= Math.max(Ans15, I2);
			int	Ans17= Math.max(Ans16, J2);
			int	Ans18= Math.max(Ans17, K2);
			int	Ans19= Math.max(Ans18, L2);
			int	Ans20= Math.max(Ans19, M2);
			int	Ans21= Math.max(Ans20, O2);
			int	Ans22= Math.max(Ans21, P2);
			int	Ans23= Math.max(Ans22, E3);
			int	Ans24= Math.max(Ans23, F3);
			int	Ans25= Math.max(Ans24, G3);
			int	Ans26= Math.max(Ans25, H3);
			int	Ans27= Math.max(Ans26, I3);
			int	Ans28= Math.max(Ans27, J3);
			int	Ans29= Math.max(Ans28, K3);
			int	Ans30= Math.max(Ans29, L3);
			Xmax = Math.max(Xmax, Ans30);
			

		}

		

		System.out.println(Xmax);
	}

}
