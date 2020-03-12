package oca.chapter4.cristina_nan.instanceof_comparison;

public class DisplayTest {

	public static void main(String[] args) {
		DisplayA a = new DisplayA();
		DisplayB b = new DisplayB();

		if (a instanceof DisplayInterface)
			System.err.println("a is instanceof DisplayInterface");

		if (b instanceof DisplayInterface)
			System.err.println("b is instanceof DisplayInterface");

		if (b instanceof DisplayA)
			System.err.println("b is instanceof DisplayA");

		if (a instanceof DisplayB)
			System.err.println("a is instanceof DisplayB");

	}

}
