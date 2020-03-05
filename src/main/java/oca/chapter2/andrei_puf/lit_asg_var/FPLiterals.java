package oca.chapter2.andrei_puf.lit_asg_var;

import static java.lang.System.*;

public class FPLiterals {
	
	public static void main(String... args) {
		
		double[] literalsD =  new double[40];


		//Decimal literals
		literalsD[0] = 245.345;
		literlasD[1] = 3_4_3.3_23_2_1;

		//Binary  literals
		literalsD[10] = 0b101011.111;
		literalsD[11] = 0b11_001.100_1;

		//Octal literals
		literalsD[20] = 01234.237;
		literalsD[21] = 06_5.2_12_3;

		//Hexadecimal literals
		
		literalsD[30] = 0xFA.AF;
		literalsD[31] = 0xB_A_C.FA_C;

		
		for(int i=0; i<40; i++) {
                   if(literals[i] != 0) {
                        out.print("LieralD[" + i + "]=");
                        out.println(literalsD[i]);
                   }
                }


		
	}
}
