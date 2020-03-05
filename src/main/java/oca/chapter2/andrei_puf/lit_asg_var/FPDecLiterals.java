package oca.chapter2.andrei_puf.lit_asg_var;

import static java.lang.System.*;

public class FPDecLiterals {
	
	public static void main(String... args) {
		
		double[] literalsD =  new double[40];


		//Decimal literals
		literalsD[0] = 0.0;
		literalsD[1] = 0.;
		literalsD[2] = .0;
		literalsD[3] = 0E0;
		literalsD[4] = 23E0;
		literalsD[5] = 1E-1;
		literalsD[7] = 1.2E-1;
		//literalsD[8] = 1.2p10;

		//Binary  literals
		//literalsD[10] = 0b101011.111;

		//Octal literals
		//literalsD[20] = 01234.237;

		//Hexadecimal literals
		//literalsD[30] = 0xFA.AF;
		
		literalsD[31] = 0xFF.0p19;
		literalsD[32] = 0x0.0p0;
		literalsD[33] = 0xF_F.0P2_2;
		literalsD[34] = 0xCafe.0p22;
		
		for(int i=0; i<40; i++) {
                   if(literalsD[i] != 0) {
                        out.print("LieralD[" + i + "]=");
                        out.println(literalsD[i]);
                   }
                }


		
	}
}
