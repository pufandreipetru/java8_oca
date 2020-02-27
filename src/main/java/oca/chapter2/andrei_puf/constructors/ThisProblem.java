package oca.chapter2.andrei_puf.constructors;

import static java.lang.System.*;

class A {
	A() {
		this("Call from default constructor");
		out.println("Default constructor of A");
	}
	A(String msg) {
		this();
		out.println("Constructor of A with arguments " + msg);
	}
}

public class ThisProblem {
	
	public static void main(String[] args) {
		new A("mesaj");
	}
	
}
