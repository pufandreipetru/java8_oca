package oca.chapter2.andrei_puf.lit_asg_var;

import static java.lang.System.*; 

public class Asignments {
	public static void main(String[] args) {
	int a, b = 2, c = b + 1;

	//int a1, b1 = a1 + 2;	

	byte a2 = 2;
	//byte b2 = a2 + 2;

	long x = 2; // implicit cast; 32 -> 64 bits
	
	float y = 2.3E4f; 
	int z = (int) y; // explicit cast from float to int
	
	int w = (int)2.3; // loses the digits after the decimal point

	byte byteNumber = (byte)1024; // max 127 |||| 1024 | 130
	out.println(byteNumber);	
	
	
	}
}
