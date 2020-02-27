package oca.chapter2.andrei_puf.constructors;

import static java.lang.System.*;

public class MethodProblem {
	static void a() {
		out.println("Method 'a()'");
		b();
	}
	static void b() {
		out.println("Method 'b()'");
		a();
	}
	public static void main(String[] args) {
		a();
	}
	
}
