package oca.chapter2.andrei_puf.constructors;

import static java.lang.System.*;

class A {
	
	}

class B {
	B() {
		out.println("Constructor of B");
	}
}

class C {
	C(String msg) {
		this();
		out.println("Constructor of C with arguments " + msg);
	}
}

class D {
	
	void D() {
		this();
		out.println("This is D");
	}
	}

public class DefaultOrNotConstructor {

	public static void main(String[] args) {
		//new A();
		//new B();
		//new C();
		//new D();
	}
	
}
