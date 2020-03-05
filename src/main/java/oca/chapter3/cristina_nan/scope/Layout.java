package oca.chapter3.cristina_nan.scope;

public class Layout {

	static int s = 11; // static variable
	int x; // instance variable

	// initialization block
	{
		x += 5;
		s += 10;
		int x2 = 22; // init block variable, a flavor of local variable.

		System.out.println("x in init block: " + x);
	}

	// constructor
	Layout() {
		x += 10;
		int x3 = 6; // constructor variable, a flavor of local variable.

		System.out.println("x in constructor: " + x);
	}

	public static void main(String[] args) {
		System.out.println("x: " + x);
		System.out.println("s in main is: " + s);
		new Layout();
		System.out.println("s after call constructor is: " + s);
	}

}
