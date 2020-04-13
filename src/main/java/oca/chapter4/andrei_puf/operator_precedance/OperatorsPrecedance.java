package oca.chapter4.andrei_puf.operator_precedance;

import static java.lang.System.*;

/**
* -------------------------------------------------------------
* | Types of Operators                   |                    |
* -------------------------------------------------------------
* | U_nary operator                      |     -, !, ++, --   |
* | M_ultiplication, division, modulus   |       *, /, %      |
* | A_dditiona, substraction             |        +, -        |
* | R_elational, operators               |    <, >, <=, >=    |
* | E_quality operators                  |      ==, !=        |
* | L_ogical operators                   |       &, |         |
* | S_ort-circuit                        |      &&, |         |
* | A_ssignmen operators                 | =, +=, -=, /=, *=  |
* -------------------------------------------------------------
**/

public class OperatorsPrecedance {
	public static void main(String... args) {
		out.print("true & false == false | true :");
		out.println(true & false == false | true);

		out.print("true && false == false || true :");
		out.println(true && false == false || true);

		out.print("1+2*3 :");
		out.println(1+2*3);
		
		out.print("1&2 :");
		out.println(1&2);
		
		out.print("1|2 :");
		out.println(1|2);
		
		int x = 0;
		int y = 0;
		out.print("++x + ++y :");
		out.println(++x + ++y);
		
		int x1 = 0;
		x1+=5;
		out.print("x+5 :");
		out.println(x1);
		
		int x2 = 0;
		x2/=5;
		out.print("x/5 :");
		out.println(x2);
		
		int x3 = 0;
		int x4 = 0;
		
		out.print("x3++ >= x4 :");
		out.println(x3++ >= x4);
				
		int i=0;
		for(;i<3; i++) {
			out.println(i);
		}
		out.println(i);

		i =0;
		for(; i<3;) {
			i++;
			out.println(i);
				
		}
	
		
	}
}
